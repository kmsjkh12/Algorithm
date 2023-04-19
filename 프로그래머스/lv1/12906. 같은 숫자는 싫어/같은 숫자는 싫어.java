import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
        
        ArrayList<Integer> arraylist = new ArrayList<>();
        int num = -1;
        
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] != num){  //num값과 다르면 추가
            arraylist.add(arr[i]);
                num = arr[i];    //num값 초기화
            }
        }
        
       int[] answer = new int[arraylist.size()];
        for (int i = 0;i <arraylist.size();i++){
            answer[i]= arraylist.get(i);
        }    
        return answer;
    }
}