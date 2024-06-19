import java.util.*;


class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        for (int i : scoville){
            pq.add(i);
        }
        
        while(!pq.isEmpty()){
            if(pq.peek() < K){
                if(pq.size()>=2){
                int a = pq.poll() + (pq.poll() * 2);
                pq.add(a);
                answer++;
                }
                else{
                    return -1;}
            }
            else{
                break;
            }
        }
        return answer;
    }
}