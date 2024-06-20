class Solution {
    static boolean visited[];
    static int max = Integer.MIN_VALUE;

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited=new boolean[dungeons.length];
        
        for(int i = 0 ; i < dungeons.length ; i++){
            if(k >= dungeons[i][0]){
                dfs(i, k-dungeons[i][1], dungeons,1);
            }
        }
        return max;
    }
    
    //n : 최소 필요 피로도 
    //m : 소모 피로도
    public void dfs(int index, int k, int[][] dungeons, int depth){
        if(max <depth){
            max= depth;
        }
        for(int i = 0 ; i < dungeons.length ;i++){
            visited[index]= true;
            if(!visited[i] && k >= dungeons[i][0]){
                dfs(i, k- dungeons[i][1],dungeons,depth+1);
            }
            visited[index]= false;
        }
    }
}