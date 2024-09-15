import java.time.*;
class Solution {
    private final int gt = 10;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        LocalTime now = LocalTime.of(0,
                                     Integer.parseInt(pos.substring(0,2)),
                                     Integer.parseInt(pos.substring(3,5))
                                    );
        
        LocalTime op_s = LocalTime.of(0,
                                     Integer.parseInt(op_start.substring(0,2)),
                                     Integer.parseInt(op_start.substring(3,5))
                                    );
        LocalTime op_e = LocalTime.of(0,
                                     Integer.parseInt(op_end.substring(0,2)),
                                     Integer.parseInt(op_end.substring(3,5))
                                    );
        
        for(int i = 0 ; i < commands.length; i++){
              if (!now.isBefore(op_s) 
                        && !now.isAfter(op_e)) {
                        now= op_e;
                    }
            if( commands[i].equals("next")){
                LocalTime newTime = now.plusSeconds(10);
                if(newTime.isAfter(
                    LocalTime.of(0,Integer.parseInt(video_len.substring(0,2)), 
                                 Integer.parseInt(video_len.substring(3,5))))){
                    now = LocalTime.of(0,
                        Integer.parseInt(video_len.substring(0,2)), 
                        Integer.parseInt(video_len.substring(3,5)));
                }
                else{
                    now= newTime;
                }
                
            }
            
            else if( commands[i].equals("prev") ){ //뒤로가기
                LocalTime newTime = subtractSeconds(now,10);

                if( newTime.isBefore(LocalTime.of(0,0,0))){
                    now = LocalTime.of(0,0,0);
                }
                
                else{
                    now= newTime;
                }
                
            }    
            if (!now.isBefore(op_s) 
                        && !now.isAfter(op_e)) {
                        now= op_e;
                    }
            
        }
        String formattedTime = formatMinutesAndSeconds(now);
        return formattedTime;
    }
    
       public static LocalTime subtractSeconds(LocalTime time, int secondsToSubtract) {
        int currentSeconds = time.toSecondOfDay(); // 현재 시간을 초 단위로 변환
        int newSeconds = currentSeconds - secondsToSubtract; // 초 단위에서 빼기
        
        // 음수 결과를 0으로 설정
        if (newSeconds < 0) {
            newSeconds = 0;
        }
        
        return LocalTime.ofSecondOfDay(newSeconds); // 초 단위로 변환하여 LocalTime 객체 생성
    }
     public static String formatMinutesAndSeconds(LocalTime time) {
        int minutes = time.getMinute();  // 분 추출
        int seconds = time.getSecond();  // 초 추출
        return String.format("%02d:%02d", minutes, seconds);
    }

}