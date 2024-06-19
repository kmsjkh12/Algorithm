import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String ,Integer > hs = new HashMap<>();
        for(int i =0 ; i < clothes.length; i++){
            if(hs.containsKey(clothes[i][1])){
                hs.put(clothes[i][1] , hs.get(clothes[i][1]) + 1);
            }
            else{
                hs.put(clothes[i][1],1);
            }
            
        }
        
        for(String key : hs.keySet()){
          answer*= hs.get(key)+1;  
        }
        
        answer -=1;
        
        
        
        return answer;
    }
}