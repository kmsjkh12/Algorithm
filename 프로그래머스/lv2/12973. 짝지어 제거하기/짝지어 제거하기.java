import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        char [] arr =s.toCharArray();
        Stack<Character> st = new Stack();
        
        for(int i = 0 ; i < s.length(); i++){
            
            if(!st.isEmpty()){
                if(st.peek() == arr[i]){
                    st.pop();
                    continue;
                }
            }
            st.push(arr[i]);
        }
 
        if(st.isEmpty()){
            answer=1;
        }
        else{
            answer=0;
        }
        
        return answer;
    }
}