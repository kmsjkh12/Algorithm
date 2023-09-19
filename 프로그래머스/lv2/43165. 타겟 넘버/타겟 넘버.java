class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(target,numbers,0,0);
        return answer;
    }
    static void dfs(int t,int [] n, 
                   int i,int result){

        if(i== n.length){
            if(result == t){
                answer++;
            }
        }
        
       else{ 
           dfs( t , n , i+1 , result+n[i] );
            dfs( t , n , i+1 , result-n[i] );
       }
        
    }
}