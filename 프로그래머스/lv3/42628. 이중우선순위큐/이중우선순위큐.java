import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int [2];
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < operations.length;i++){
            
            StringTokenizer st = new StringTokenizer(operations[i]);
            String line = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            if( min.size()<1 && line.equals("D")){
                continue;
            }
            if(line.equals("I")){
                min.offer(value);
                max.offer(value);
                continue;
            }
            if(value<0){
                int a = min.poll();
                max.remove(a);
                continue;
            }
            int b = max.poll();
            min.remove(b);
           
            
}
        
         
            if(min.size() > 0){
            answer[0] = max.poll();
            answer[1] = min.poll();
            }

        return answer;
    }
}