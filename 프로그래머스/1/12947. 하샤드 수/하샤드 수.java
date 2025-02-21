class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String [] a = Integer.toString(x).split("");

        int sum =0;
        
        for(int i = 0 ; i< a.length; i++){
            sum += Integer.parseInt(a[i]);
        }
        if( x % sum != 0){
            answer= false;
        }
        
        return answer;
    }
}