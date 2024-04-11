import java.time.LocalDate;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int[] result=new int[privacies.length];
        int count=0;
        HashMap<String,Integer> term=new HashMap<>();
        for(int i=0;i<terms.length;i++){
            String[] temp=terms[i].split(" ");//A, 6으로 분할
            term.put(temp[0],Integer.valueOf(temp[1]));
        }
        //A:6, B:12, C:3

        String[] t=today.split("\\.");
        int[] nows=new int[3];
        for(int i=0;i<3;i++){
            nows[i]=Integer.valueOf(t[i]);
        }
        LocalDate now=LocalDate.of(nows[0],nows[1],nows[2]);

        for(int i=0;i<privacies.length;i++){
            String[] temp=privacies[i].split(" ");
            String day=temp[0];
            String name=temp[1];

            int during=term.get(name);

            String[] s=day.split("\\.");
            int[] signs=new int[3];
            for(int j=0;j<3;j++){
                signs[j]=Integer.valueOf(s[j]);
            }
            LocalDate signday=LocalDate.of(signs[0],signs[1],signs[2]);
            //만기일은 사인한 날 하루전에 만기
            LocalDate expire=signday.plusMonths(during).minusDays(1);

            //오늘 날짜가 만기일보다 크면, 삭제해야함
            if(now.isAfter(expire)){
                result[count]=i+1;
                count++;
            }

        }

        answer=new int[count];
        for(int i=0;i<count;i++){
            answer[i]=result[i];
        }
        
        return answer;
    }
}