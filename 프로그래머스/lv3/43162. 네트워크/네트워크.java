class Solution {
    static boolean visited [];
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[computers.length];
        
        for (int i = 0 ; i< computers.length;i++){
            visited[i]=false;    
        }
        for (int i = 0 ; i < computers.length;i++){
            if(!visited[i]){
            answer++;
            dfs(i,computers);
            }
        }
        
        
        
        return answer;
    }
    private static void dfs(int c, int [][]computers){
        visited[c] =true;
        for(int i = 0 ;i <computers.length;i++){
            if( !visited[i] && computers[c][i] ==1){
                dfs(i,computers);
            }
        }
    }
}