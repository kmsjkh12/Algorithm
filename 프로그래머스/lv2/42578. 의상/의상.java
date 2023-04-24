import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;
       
        //같은 옷이 몇 벌인지만 확인하면 됨
        for(int i = 0 ; i< clothes.length; i++){
            String c = clothes[i][1];
            map.put(c, map.getOrDefault(c, 1) + 1);
                //값이 없으면 1을 추가하고 있으면 1을 더해준다.
        }
           for (String key : map.keySet()) {
            answer *= map.get(key);
        }
    
        return answer-1;
    }
}

