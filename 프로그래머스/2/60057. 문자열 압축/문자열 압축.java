class Solution {
    public int solution(String s) {
        int answer = s.length();
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i <= s.length()/2; i++){
            int pos = 0;
            int len = s.length();
            
            for( ;pos + i <=s.length();){
                String line = s.substring(pos, pos+i);
                int cnt = 0;
                pos+= i;
                
                for( ;pos+i <= s.length(); ){
                    
                    if(line.equals(s.substring(pos, pos+i))){
                        pos +=i;
                        cnt++;
                        
                    }
                    else{
                         break;
                    }
                }
                if( cnt >0 ){
                    len -= i*cnt;
                    
                    if (cnt <9){
                        len +=1;
                    }
                    else if( cnt < 99){
                        len +=2;
                    }
                    
                    else if( cnt < 999){
                        len +=3;
                    }
                    else{
                        len +=4;
                    }
                }
            }
            answer = Math.min(len, answer);
        
        }
        return answer;
    }
}