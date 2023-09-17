import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Stack<int[]> st = new Stack<>();
        Arrays.sort(routes, Comparator.comparingInt(o1 -> o1[1]));
        int cam = Integer.MIN_VALUE;

        
        for(int[] route : routes) {
            if(cam < route[0]) {
                // 현재 카메라의 위치가 route의 시작 지점보다 작으면
                // 새로운 cam을 route의 종료 지점에 설치한다
                cam = route[1];
                answer++;
            }
        }
        
        
        return answer;
    }
}