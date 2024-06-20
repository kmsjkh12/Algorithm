class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0;  //가
        int max_h = 0; //세
        
        for(int i = 0 ; i < sizes.length ; i++){
            int max = Math.max(sizes[i][0],sizes[i][1]);
            int min = Math.min(sizes[i][0],sizes[i][1]);
            
            max_w = Math.max(max_w, max);
            max_h = Math.max(max_h, min);   
        }
        return max_w*max_h;
    }
}