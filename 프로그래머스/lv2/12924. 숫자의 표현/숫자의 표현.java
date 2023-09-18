class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int end = 1;
      while(start<= n ){
        int result = 0;
        for(int i = start ; i <= end ; i ++){
            result+= i; 
        }
         if(result == n){
            answer++;
            start++;
            end=start;
         } 
          
         else if(result<n){
            end++;
         }
         
         else{
            start++;
            end= start;
         }
}
        return answer;
        
    }
}