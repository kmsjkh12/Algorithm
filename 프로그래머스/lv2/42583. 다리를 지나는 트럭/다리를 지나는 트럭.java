import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        int count=0;
        
        Queue<Integer> qd = new LinkedList<>();
        for(int i : truck_weights){
            while(true){
                if(qd.isEmpty()){
                    qd.add(i);
                    sum+=i;
                    count++;
                    break;
                }
                
                else{
                    if(qd.size() ==bridge_length){
                    sum -= qd.poll();   
                }
                    else if(sum+i > weight){
                        qd.offer(0);
                        count++;
                    }
                    else{
                        qd.offer(i);
                        sum+=i;
                        count++;
                        break;
}
                }
            }
        }
    
        
        
        return answer+count+bridge_length;
    }
}