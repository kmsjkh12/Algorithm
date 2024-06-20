import java.util.*;

class Solution {
    List<String> str_list;
    String [] word_list = {"A","E","I","O","U"};
    public int solution(String word) {
        int answer = 0;
        
        str_list= new ArrayList<>();
        dfs("", 0);
        
        int size =str_list.size();
        
        answer= str_list.indexOf(word);
        return answer;
    }
    

    public void dfs(String str, int depth){
        
        str_list.add(str);
        
        if( depth== 5){
            return;
        }
        for(int i = 0 ; i < 5; i++){
            dfs(str+word_list[i], depth+1);
        }
    }
    

}