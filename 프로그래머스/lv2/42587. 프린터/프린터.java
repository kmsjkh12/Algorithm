import java.util.*;
class Solution {
    class Printer{
        int priorities;
        int location;
        public Printer(int priorities, int location){
            this.priorities=priorities;
            this.location=location;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> queue = new LinkedList<>();
        
        for(int i = 0 ; i <priorities.length;i++){
            queue.add(new Printer(priorities[i], i)); //순서대로 삽입, index와 함께
        }
        
        int now = 0;
        while(!queue.isEmpty()){
            Printer p = queue.poll();
            boolean h = false;
            for(Printer i : queue){
                if(p.priorities<i.priorities){
                    h=true;
                }
            }
            if(h){
            queue.add(p);
            }
            else{
                now++;
                if(location== p.location){
                    answer = now;
                    break;
                }
                
            }
        }
        
        
        
        return answer;
    }
}