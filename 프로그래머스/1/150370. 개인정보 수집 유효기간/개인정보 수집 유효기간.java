import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int date = getDate(today);

        for(String a: terms){
            String [] term = a.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }
        
        for(int i = 0 ; i < privacies.length;i++){
            String privace[] = privacies[i].split(" ");
        
            if (getDate(privace[0]) + (map.get(privace[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(integer -> integer).toArray();
        
    }
    
     private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}