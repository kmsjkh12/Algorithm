import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_v = 0;
        int max_y = 0;
        for(int i = 0; i <sizes.length;i++){
            int v = Math.max(sizes[i][0], sizes[i][1]); //80
            int y = Math.min(sizes[i][0], sizes[i][1]); //30
            
            max_v = Math.max(max_v,v);
            max_y = Math.max(max_y,y);
        }
        
        
        return max_v*max_y;
    }
}