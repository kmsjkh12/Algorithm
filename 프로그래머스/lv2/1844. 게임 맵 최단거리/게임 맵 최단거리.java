import java.util.*;


class Solution {
    static boolean visited[][];
    static int count = 0 ;
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,-1,0,1};
    
    
    public int solution(int[][] maps) {
        int answer = 0;
    
        visited= new boolean[maps.length][maps[0].length];
        
        
        bfs(0,0,maps);
        
        answer = maps[maps.length-1][maps[0].length-1];
        if(answer==1){
            answer=-1;
        }
        return answer;
    }
    
    static void bfs(int x,int y, int [][] m){
        
        Queue<int [] > q = new LinkedList<>();
        q.add(new int [] {x,y});
        
        while(!q.isEmpty()){
            int now[] = q.poll();
            
            for(int i = 0 ; i < 4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if(nx >=0 && nx < m.length && ny >= 0 && ny< m[0].length
                  &&!visited[nx][ny] && m[nx][ny] == 1 
                  ){
                    visited[nx][ny]=true;
                    
                    m[nx][ny] = m[now[0]][now[1]] + 1;
                    q.add(new int []{nx,ny});
                }
            }
        }
        
    }
}