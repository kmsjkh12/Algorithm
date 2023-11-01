import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for( int i = 0 ; i < s.length() ; i++ ){
            if(s.substring(i,i+1).equals("(")){
                count += 1;
            }
            else{
                if(count ==0) return false;
                count -=1;
            }
        }
        
        return count ==0;
    }
    
  
}