class Solution {
    public int[] solution(long n) {
        String line = String.valueOf(n);
        
        int[] answer = new int [line.length()];

        
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = Integer.parseInt(line.substring(answer.length-1-i, 
                                                     answer.length-i));
        }
        return answer;
    }
}