import java.util.*;
class Solution {
    int dx [] = {-1, 0, 1, 0};
    int dy [] = {0, 1, 0 ,-1};
    
    boolean visited [][];
    public int solution(int [][] maps) {
        int answer = 0;
        
        visited = new boolean[maps.length][maps[0].length];
        return bfs(0,0,maps);
    }
    
    
    private int bfs(int x, int y, int [][] maps){
        Queue<int []> queue= new LinkedList<>();

        queue.offer(new int[] {x,y});
        while(!queue.isEmpty()){

            int [] temp = queue.remove();
            int temp_x = temp[0];
            int temp_y = temp[1];
            
        for(int i = 0;i <4; i++){
            int nx = temp_x+ dx[i];    
            int ny = temp_y+ dy[i];   
            if(nx<0 || nx > maps.length -1|| ny<0 || ny > maps[0].length-1)
                continue;
            
            if(!visited[nx][ny] && maps[nx][ny]!=0){
                maps[nx][ny]=maps[temp_x][temp_y]+1;
                queue.offer(new int [] {nx,ny});
                visited[nx][ny]= true;

            }
            
        }
        }
        
        
      int result =  maps[maps.length-1][maps[0].length-1];
      if(result ==1){
          return -1;
          
      }
        else{
return result;}
        
    }
}