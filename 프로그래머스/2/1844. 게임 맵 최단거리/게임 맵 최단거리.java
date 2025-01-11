import java.util.*;

class Solution {
    int dx[] ={-1,0,1,0};
    int dy[] ={0,-1,0,1};
    public int solution(int[][] maps) {
        int answer = 0;
        int visited [][] = new int[maps.length][maps[0].length];
        
        bfs(maps,visited);
        answer = visited[maps.length-1][maps[0].length-1];
        
        if ( answer == 0 ){
            answer= -1;
        }
        return answer;
    }
    public void bfs(int[][] maps, int visited [][]){
        int x = 0;
        int y = 0;
        visited[x][y]=1; 
        
        Queue<int [] > q = new LinkedList<>();
        
        q.add(new int []{x,y});
        while(!q.isEmpty()){
            int current [] = q.remove();
            
            int nx = current[0];
            int ny = current[1];
            
            for(int i = 0; i < 4 ; i++){
                int cx = nx+dx[i];
                int cy = ny+dy[i];
                
                if( cx < 0 || cx > maps.length-1 || 
                   cy <0 || cy > maps[0].length-1 ){
                    continue;   
                }
                
                if(visited[cx][cy] == 0 && maps[cx][cy] == 1){
                    visited[cx][cy] = visited[nx][ny] + 1; 
                    q.add(new int []{cx,cy});
                }
            }
            
        }
    }
}