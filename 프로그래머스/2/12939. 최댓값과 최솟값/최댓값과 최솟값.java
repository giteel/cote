class Solution {
    public String solution(String s) {
        
        String[] list = s.split(" ");
        int max, min;
        
        if ( Integer.parseInt(list[0]) > Integer.parseInt(list[1]) ) {
            max = Integer.parseInt(list[0]);
            min = Integer.parseInt(list[1]);
        } else {
            max = Integer.parseInt(list[1]);
            min = Integer.parseInt(list[0]);
        }
        
        for (int i=2; i<list.length; i++) {
            if ( Integer.parseInt(list[i]) > max ) max = Integer.parseInt(list[i]);
            if ( Integer.parseInt(list[i]) < min ) min = Integer.parseInt(list[i]);
        }
        
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}