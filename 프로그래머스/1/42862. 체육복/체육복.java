import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer=n;
        ArrayList <Integer> l = new ArrayList<>();
        ArrayList <Integer> r = new ArrayList<>();
        
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        for(int i: lost){
            l.add(i);
        }
        
        for(int i: reserve){
            if(l.contains(i)){
                l.remove(Integer.valueOf(i));
                continue;
            }
            r.add(i);
        };
        
        for(int i : l){
         
            if(r.contains(i-1)){  //앞번호가 빌려줌
                r.remove(Integer.valueOf(i-1));
            }
            else if(r.contains(i+1)){  //뒷번호가 빌려줌 
                r.remove(Integer.valueOf(i+1));
            }
            else{
                answer--;
            }
        }
        return answer;
    }
}