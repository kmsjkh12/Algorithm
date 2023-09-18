import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();

        
        
        
        for(int i =0 ; i < A.length;i++){
            min.add(A[i]);
            max.add(B[i]);
        }
        
        Collections.sort(min);
        Collections.sort(max, Collections.reverseOrder());
        
        for(int i = 0 ; i < min.size();i++){
            answer+= min.get(i) * max.get(i);
        }
        return answer;
    }
}