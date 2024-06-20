import java.util.*;

class Solution {
    static boolean visited [];
    static HashSet<Integer> set ;
    
    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[7];
        set = new HashSet<>();
        dfs(numbers, "", 0);
        
        for(Integer i : set){
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(String numbers,String line, int depth){
        
        if(depth == numbers.length()){
            return;
        }
        for(int i = 0 ; i< numbers.length();i++){
            if(!visited[i]){
                visited[i]= true;
                set.add(Integer.parseInt(line+numbers.charAt(i)));
                dfs(numbers, line+numbers.charAt(i), depth+1);
                visited[i]= false;
            }
        }
    }
    
    
    
    public boolean isPrime(int n){
        
        if(n<2){
            return false;
        }
        for(int i = 2 ; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
    return true;

    }
}