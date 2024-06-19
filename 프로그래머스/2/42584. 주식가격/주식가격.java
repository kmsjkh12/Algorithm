import java.util.*;
import java.io.*;

class Solution {
    public List<Integer>  solution(int[] prices) {
        List<Integer> list = new ArrayList<>();       
       
        for(int i = 0 ; i < prices.length-1 ; i++){
            int a = 0;
            for(int j = i+1 ; j < prices.length ; j++){
                if(prices[i] <= prices[j]){
                    a++;
                }
                else {
                    a++;
                    break;
                }
                
            }
            list.add(a);
        }
        list.add(0);
        return list;
    }
}