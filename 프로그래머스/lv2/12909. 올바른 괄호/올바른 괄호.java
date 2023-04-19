import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st= new Stack<Character>();
 
        if(s.charAt(0) == ')'){
            return false;
        }
        else {        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(st.empty()){
                    return false;
                }
                st.pop();
                
            }
        }
    }
        if(st.empty()){
            answer = true;
        }
        else{
            answer = false;
        }
       
        
        return answer;
    }
}