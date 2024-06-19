class Solution {
    static boolean visited[];
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited= new boolean[n];
        
        for(int i = 0 ; i < computers.length; i++){
            for(int j = 0 ; j < computers[0].length; j++){
                if(computers[i][j] == 1 && !visited[i]){
                    dfs(i,computers);
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public void dfs(int x,int[][] computers){
        if(visited[x]){
            return;
        }
        
        visited[x]=true;
        
        for(int i =0 ; i < computers[0].length; i++){
            if(computers[x][i] == 1 && !visited[i]){
                dfs(i,computers);
        }
    }
    }
}