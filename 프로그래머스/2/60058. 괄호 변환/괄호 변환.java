import java.util.*;

class Solution {
    int pos;
    
    boolean collect (String str){
        boolean flag= true;
        int left =0;
        int right = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == '('){
                left++;
                st.push('(');
            }
            else{
                right++;
                if(st.isEmpty()){
                    flag= false;
                }
                else{
                    st.pop();
                }
            }
            if(left == right){
                pos = i+1;
                return flag;
            }
            
        }
        return true;
       
    }
    public String solution(String p) {
        if( p.isEmpty()){
            return ""; 
        }
        
        boolean flag = collect(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos, p.length());
       
       
        
        if(flag){
            return u + solution(v);
        }
        
        String answer = "(" + solution(v) + ")";
        
        for(int i =1 ; i < u.length()-1; i++){
            if(u.charAt(i) == '(' ){
                answer += ")";
            }
            else{
                answer += "("; 
            }
        }
        return answer;
    }
}