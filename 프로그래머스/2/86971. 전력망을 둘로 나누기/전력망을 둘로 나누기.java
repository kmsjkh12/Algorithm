import java.util.*;

class Solution {
    static ArrayList<Integer>[] arr;
    static int min;
    public int solution(int n, int[][] wires) {
        int answer = -1;
        
        arr = new ArrayList[ n + 1 ];
        min = Integer.MAX_VALUE;
        
        for( int i = 1; i <= n; i++ ){
            arr[i] =new ArrayList<>();
        }
        
        for(int i = 0; i< wires.length; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            arr[v1].add(v2);
            arr[v2].add(v1);
        }
        
        for(int i = 0; i< wires.length; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            boolean[] visited = new boolean[n+1];
            
            arr[v1].remove(Integer.valueOf(v2));
            arr[v2].remove(Integer.valueOf(v1));
            
            int cnt = dfs(1, visited);
            
            int diff = Math.abs(cnt - ( n - cnt ));
            min =Math.min(diff,min);
            arr[v1].add(v2);
            arr[v2].add(v1);
        }
        
        
        
        return min;
    }
    public static int dfs(int v , boolean [] visited ){
        visited[v] =true;
        int cnt = 1;
        
        for( int i : arr[v]){
            if(!visited[i]){
                cnt +=dfs(i, visited);
            }
        }
        return cnt;
    }
}