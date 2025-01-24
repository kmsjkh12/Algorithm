import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        for(String str  : cities){
            String c = str.toUpperCase();
            if (!list.contains(c)){
                list.add(c);
                if(list.size() > cacheSize){
                    list.remove(0);
                }
                answer+= 5;
            }
            
            else if(list.contains(c)){
                list.remove(c);
                list.add(c);
                answer+=1;
            }
        }
        return answer;
    }
}