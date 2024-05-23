class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder builder = new StringBuilder();
        
        String[] str = s.split(" ");
        char end = s.charAt(s.length() - 1);
        
        for (int i=0; i<str.length; i++) {
            String word = str[i];
            
            if  (word.equals("")) {
            } else if (word.substring(0, 1).matches("\\d")) {
                builder.append(word.substring(0, 1));
                builder.append(word.substring(1).toLowerCase());
            } else {
                builder.append(word.substring(0, 1).toUpperCase());
                builder.append(word.substring(1).toLowerCase());   
                
            }
            
            if (i < str.length-1) builder.append(" ");
            else if ( i == str.length-1) {
                if ( word.equals("") ) builder.append(" ");
            }
        }
        
        if ( end == ' ') {
            builder.append(" ");
        }
        
        answer = builder.toString();
        
        return answer;
    }
}