import java.util.*;

class Solution {
      
        Map<String, String> tree = new HashMap<>();
        Map<String, Integer> money = new HashMap<>();
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = {};
      
        
        for(int i = 0 ; i < enroll.length;i++){
            tree.put(enroll[i], referral[i]);
        }
        
        for(int i = 0 ; i < seller.length;i++){
            share(seller[i], amount[i] * 100);
        }
        int[] result = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            result[i] = money.getOrDefault(enroll[i], 0);
        }
        return result;
    }
    public void share(String name, int amount){
        int sellingAmount = amount / 10; //할인금액
        
        money.put(name, money.getOrDefault(name, 0) + amount- sellingAmount);
        
        if( sellingAmount > 0 && tree.containsKey(name) ){
            share(tree.get(name),sellingAmount);
        }
    }
    
    
}
