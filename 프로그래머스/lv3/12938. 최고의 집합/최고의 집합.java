import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        int wake = s/n;
        int na = s%n;
        int[] answer =new int [n];
        if(wake!=0){   

            for(int i = 0 ; i < n ;i++){
                answer[i] = wake;
            }
            for(int i = 0; i < na;i++){
                answer[i]++;
            }
     
            Arrays.sort(answer);
            }
        
        else{
            answer=new int [1];
            answer[0] = -1;
        }
       
        
        return answer;
        
        
    }
}