import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String list [] = Long.toString(n).split("");
        
        Arrays.sort(list,Collections.reverseOrder());
        
        String s ="";
        
        for(int i = 0 ; i < list.length ; i++){
            s+= list[i];
        }
        
        answer = Long.parseLong(s);
        
        return answer;
    }
}