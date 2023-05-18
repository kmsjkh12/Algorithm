import java.util.*;
class Solution {
    static boolean [] visited;
    static List<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        visited = new boolean[tickets.length];
        
        dfs(0, "ICN","ICN", tickets);
        Collections.sort(list);
        return list.get(0).split(" ");
    }
    
    private static void dfs(int x, String start, String path, String [][] tickets){
        if(x==tickets.length){
            list.add(path);
            return;
        }
        for (int i = 0 ; i < visited.length;i++){
            if(!visited[i]&& start.equals(tickets[i][0])){
                visited[i]=true;
                dfs(x+1, tickets[i][1],path+ " " + tickets[i][1], tickets);
                visited[i]=false;
            }
        }
        }
    
}