import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int [] answer = {-1};
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int a : arr){
            if( a % divisor ==0){
                li.add(a);
            }
        }
        
        if( li.size() != 0){
            answer= new int [li.size()];
            for(int i = 0 ; i< li.size() ;i++){
                answer[i] = li.get(i);
            }
        }
        
        Arrays.sort(answer);
    
        
        return answer;
    }
}