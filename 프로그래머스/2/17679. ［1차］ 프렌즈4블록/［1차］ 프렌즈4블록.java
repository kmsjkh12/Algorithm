class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        Character [][] map = new Character[m][n];
        
        for(int i =0 ; i< board.length; i++){
            String line = board[i];
            for(int j = 0 ; j< line.length() ; j++){
                map[i][j]= line.charAt(j);
            }
            
        }
        
      
        
        while(true){
            boolean [][] visited = new boolean[m][n];
            boolean isFlag = false;
             for(int i = 0 ; i < m-1; i++){
                for(int j = 0 ; j < n-1; j++){
                    if( map[i][j] == '-') continue;
                    if(
                        map[i][j] != '-' && 
                        map[i][j] == map[i][j+1] &&
                        map[i][j] == map[i+1][j] &&
                       map[i][j] == map[i+1][j+1]
                    ){
                        
                        isFlag=true;
                        visited[i][j]= true;
                        visited[i][j+1]= true;
                        visited[i+1][j]= true;
                        visited[i+1][j+1]= true;  
                    }              
                }
            }
           
            if (!isFlag) break;

           
            if(isFlag){
            
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j< n ;j++){
                    if(visited[i][j]){
                        map[i][j]='-';
                    }
                }
            }
            
          
            
            
            for(int i =m-1 ; i >= 0 ; i--){
                for(int j = n-1 ; j >= 0 ; j--){
                    if(map[i][j] == '-'){
                        for(int k = i-1 ; k >= 0; k--){
                            if(map[k][j] == '-') continue;
                            
                            if(map[k][j] != '-'){
                                map[i][j] = map[k][j];
                                map[k][j] = '-';
                                break;
                            }
                            
                        }
                    }
                }
            }  
            }
          
        }    
    
        
         
        for(int i = 0 ; i < m; i++){
                for(int j = 0 ; j < n ; j++){
                    if(map[i][j] == '-'){
                        answer++;
                    }
                }
            }
        return answer;
    }
    

    
    
}