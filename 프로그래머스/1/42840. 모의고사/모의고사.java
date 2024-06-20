import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> l = new ArrayList<>();
        int one[] = { 1,2,3,4,5 };
        int two[] = {2,1,2,3,2,4,2,5};
        int three [] = {3,3,1,1,2,2,4,4,5,5};
        
        int one_answer = 0;
        int two_answer = 0;
        int three_answer = 0;
        
        for(int i = 0 ; i < answers.length; i++){
            if(answers[i] == one[i%5]){
                one_answer++;
            }
            if(answers[i] == two[i%8]){
                two_answer++;
            }
            if(answers[i] == three[i%10]){
                three_answer++;
            }
        }
        int max = Math.max(one_answer, Math.max(two_answer, three_answer));
           
            if(max == one_answer){
                l.add(1);
            }
            if(max == two_answer){
                l.add(2);
            }
            if(max == three_answer){
                l.add(3);
            }
       
        return l;
    }
}