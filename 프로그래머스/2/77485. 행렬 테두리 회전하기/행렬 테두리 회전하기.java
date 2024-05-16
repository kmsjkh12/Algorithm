class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {    
        int [][] map = createArray(rows,columns);
    
        return searchMinValue(map, queries);
    }
    
    public int []searchMinValue (int [][] map, int [][] queries){
        int [] answer = new int [queries.length];
        int minIndex= 0;
        for(int [] query : queries){
            int x1 = query[0]-1;
            int y1 = query[1]-1;
            int x2 = query[2]-1;
            int y2 = query[3]-1;
            
            int changeNum = map[x1][y2];
            int min= changeNum;
            
            //상단 우측 이동
            for(int i = y2-1 ; i>= y1;i--){
                min = Math.min(min,map[x1][i]);
                map[x1][i+1] = map[x1][i]; 
            }
            
            //좌측 위로 이동
            for(int i = x1+1 ; i <= x2 ; i++){
                min = Math.min(min, map[i][y1]);
                map[i-1][y1] = map[i][y1];   
            }
            
            //하단 좌측 이동
            for(int i = y1+1 ; i <= y2 ; i++){
                min = Math.min(min , map[x2][i]);
                map[x2][i-1] = map[x2][i];
            }
            
            //좌측 아래로 이동
            for(int i = x2-1; i >= x1; i--){
                min = Math.min(min, map[i][y2]);
                map[i+1][y2]= map[i][y2];
            }
            map[x1+1][y2]= changeNum;
            answer[minIndex]= min;
            minIndex++;
        }    
        return answer;
    }
    public int[][] createArray(int rows, int columns){
        int [][] arr = new int [rows][columns];
        int value= 1;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns; j++){
                arr[i][j]= value;
                value++;
            }
        }
        return arr;
    }
}