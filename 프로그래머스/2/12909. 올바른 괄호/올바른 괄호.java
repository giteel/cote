import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println(s);
        
        if ( s.charAt(0) != '(' || s.charAt(s.length()-1) !=')' ) return false;
        
        Stack<Character> stk = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if ( s.charAt(i) == '(' ) {
                stk.push(s.charAt(i));
            } else if ( s.charAt(i) == ')' ) {
                if (stk.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stk.pop();
                }
            }
        }
        
        if (!stk.isEmpty()) answer = false;
        

        return answer;
    }
}
