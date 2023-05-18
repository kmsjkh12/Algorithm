class Solution {
    static boolean visited[];
     static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        for(int i = 0 ; i < words.length ; i++){
            visited[i]= false;
        }
        dfs( 0, words, begin, target);
        return answer;
    }
    private static void dfs( int x, String[] words, String begin, String target)    {       
        if(begin.equals(target)){
            answer= x;
            return;
            }
        
        for (int i = 0 ; i< words.length;i++){
            int count =0;
            
            if(visited[i]){
                continue;
            }
            
            for (int j =0; j<begin.length();j++){
                if(begin.charAt(j)== words[i].charAt(j)){
                    count++;
                }
            }
            
            if(count == begin.length()-1){    
                visited[i]=true;
                dfs(x+1, words, words[i], target);
                visited[i]=false;
            }
               
        }
        
        
    }
}