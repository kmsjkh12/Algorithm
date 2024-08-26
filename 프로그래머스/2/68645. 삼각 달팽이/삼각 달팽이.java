class Solution {
    public int[] solution(int n) {
    
        int answer [] = new int [n*(n+1) / 2];
        int map [][] =new int [n+1][n+1];
        
        
        int x = -1;
        int y = 0;
        int value = 1;
        
        for(int i = 0 ; i < n; i++){
            for(int j= i ; j< n; j++){
                if(i % 3  ==0){
                    x++;
                }
                else if (i % 3 == 1){
                    y++;
                }
                else if (i % 3 ==2){
                    x--;
                    y--;
                }
                map[x][y] = value++;
            }
        }
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                if(map[i][j] ==0){
                    break;
                }
                answer[index] = map[i][j];
                index ++;
            }
        }
        return answer;
    }
}