import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0; 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i= 0 ; i<nums.length;i++){
            if(nums.length/2==count){
                break;
            }
            else if(!map.containsKey(nums[i])){
                count++;   
                System.out.println(count);
                map.put(nums[i],i);
                 
             }
        
        }
        
        answer=map.size();
        return answer;
    }
}