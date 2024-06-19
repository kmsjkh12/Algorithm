class Solution {
    static boolean visited [];
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        visited= new boolean[numbers.length];
        
        dfs(0,0,numbers, target);
        return answer;
    }
    
    public void dfs(int sum,int i,int[] numbers,int target){
        
        if (i== numbers.length){
            if(sum == target){
                answer++;
            }
        }
       else{
        
        dfs(sum + numbers[i], i+1, numbers,target);
        dfs(sum -numbers[i], i+1, numbers,target);
        
       }
    }
        
        

}