import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int count = nums.length / 2;
        
        HashMap<Integer, Integer> hs= new HashMap<>();
        
        
        for(int i = 0 ; i < nums.length; i++){
            if(hs.isEmpty()){
                hs.put(nums[i], 0);
            }
            else if(!hs.containsKey(nums[i])){
                hs.put(nums[i], 0);
            }
        }
        if(hs.size() >= count){
            answer= count;
        }
        else{
            answer=hs.size();
        }
        
        return answer;
    }
}