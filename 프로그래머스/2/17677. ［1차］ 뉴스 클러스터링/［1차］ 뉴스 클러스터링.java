import java.util.*;


class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        List<String> str1List = toSplitString(str1);
        List<String> str2List = toSplitString(str2);
        
        if(str1List.isEmpty() && str2List.isEmpty()){
            return 65536;
        }
        
        List<String> union = new ArrayList<>(); //합
        List<String> inter = new ArrayList<>(); //교
        
        for(String s : str1List){
            if(str2List.remove(s)){
                inter.add(s);
            }
            
            union.add(s);
        }
        union.addAll(str2List);
        double jakad = (double) inter.size() / (double) union.size();
        return (int) (jakad * 65536);
    }
    public List<String> toSplitString(String str){
        List<String> strList = new ArrayList<>();
        
        str = str.toUpperCase();
        
        for(int i = 0 ; i < str.length()-1; i++){
            String line = str.substring(i, i+2).replaceAll("[^A-Z]", "");
            
            if(line.length() < 2){
                continue;
            }
            strList.add(line);
        }
        return strList;
    }
}

