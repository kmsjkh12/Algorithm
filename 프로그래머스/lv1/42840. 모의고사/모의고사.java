import java.util.*;

class Solution {
    
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> count_max = new ArrayList<>();
        
        
        int arr1 []= {1,2,3,4,5};
        int arr2 []= {2,1,2,3,2,4,2,5};
        int arr3 []= {3,3,1,1,2,2,4,4,5,5};
        int count [] = new int[3];
        for (int i = 0 ; i<answers.length;i++){
            if(answers[i]== arr1[i%5])
                count[0]++;
            if(answers[i]== arr2[i%8])
                count[1]++;
            if(answers[i]== arr3[i%10])
                count[2]++;
        }
        int max = Math.max(count[0], Math.max(count[1],count[2]));
        
        if(max == count[0]){
            count_max.add(1);
        }
        
        if(max == count[1]){
            count_max.add(2);
        }
        
        if(max == count[2]){
            count_max.add(3);
        }
        
        answer = new int [count_max.size()];
        for(int i =  0 ; i<count_max.size();i++){
            answer[i]=count_max.get(i);
        }
        return answer;
    }
}