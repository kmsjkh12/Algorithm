import java.util.*;
import java.io.*;


class Solution {
    public List<Integer>  solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        int a = 1;
        for(int i = 0 ; i < progresses.length; i++){
            int more  = 100 - progresses[i];
            
            int k = 1; 
            while(true){
                if(more <= k * speeds[i]){
                   break; 
                }
                k++;
            }
            
            if(st.empty()){
                st.push(k);
            }
           
            else if(st.peek() >= k){
                a++;
            }
            
            else if (st.peek() < k){
                st.pop();
                answer.add(a);
                st.push(k);
                a=1;
            }
        }
        answer.add(a);
        return answer;
    }
}