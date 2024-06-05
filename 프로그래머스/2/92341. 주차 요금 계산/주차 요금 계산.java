import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, String> car_time = new HashMap<String, String>();
        
        for(String record : records) {
            String time = record.split(" ")[0];
            String number = record.split(" ")[1];
            String status = record.split(" ")[2];
            
            if (!car_time.containsKey(number)) {
                car_time.put(number, (status+" "+time+" "));
            } else {
                car_time.put(number, (car_time.get(number)+status+" "+time+ " "));
            }
        }
        
        List<String> keySet = new ArrayList<>(car_time.keySet());
        Collections.sort(keySet);
        
        int[] answer = new int[keySet.size()];
        int count = 0;
        LocalTime date1 = LocalTime.now();
        LocalTime date2 = LocalTime.now();
        
        
        
        for (String num : keySet) {
            String str = car_time.get(num).trim();
            String[] time_status = str.split(" ");
            int minutes = 0;
            for (int i=0; 2*i< time_status.length; i++) {
                if (time_status[2*i].equals("IN") && ( 2*(i+1) >= time_status.length) ) {
                    int h = Integer.parseInt(time_status[2*i+1].split(":")[0]);
                    int m = Integer.parseInt(time_status[2*i+1].split(":")[1]);
                    
                    date1 = LocalTime.of(h, m);
                    date2 = LocalTime.of(23, 59);

                    long difference = ChronoUnit.MINUTES.between(date1, date2);
                    minutes = minutes + (int) difference;

                } else if (time_status[2*i].equals("OUT")) {
                    int h = Integer.parseInt(time_status[2*i+1].split(":")[0]);
                    int m = Integer.parseInt(time_status[2*i+1].split(":")[1]);
                    
                    date2 = LocalTime.of(h, m);

                    long difference = ChronoUnit.MINUTES.between(date1, date2);
                    minutes = minutes + (int) difference;

                } else {
                    int h = Integer.parseInt(time_status[2*i+1].split(":")[0]);
                    int m = Integer.parseInt(time_status[2*i+1].split(":")[1]);
                    
                    date1 = LocalTime.of(h, m);
                }
            }
            
            if (minutes  > fees[0] ) {
                int mins = (minutes - fees[0]) % fees[2] != 0 ? (minutes - fees[0]) / fees[2] + 1 : (minutes - fees[0]) / fees[2];   
                answer[count++] = fees[1] + mins*fees[3];
            } else {
                answer[count++] = fees[1];
            }
            
            //answer[count++] = minutes;
        }
        
        
        return answer;
    }
}