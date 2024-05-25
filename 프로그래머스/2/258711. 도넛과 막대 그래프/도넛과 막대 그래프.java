import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = {0, 0, 0, 0};
        
        HashMap<Integer, int[]> inOut = new HashMap<Integer, int[]>();
        
        for (int[] edge : edges) {
            if (!inOut.containsKey(edge[0])) inOut.put(edge[0], new int[]{0,0});
            if (!inOut.containsKey(edge[1])) inOut.put(edge[1], new int[]{0,0});
            
            inOut.get(edge[1])[0]++;
            inOut.get(edge[0])[1]++;
        }
        
        boolean startPoint = false;
        for( int key : inOut.keySet() ){
            int[] value = inOut.get(key);
            
            if (!startPoint) {
                if (value[0] == 0 && value[1]>= 2) {
                    answer[0] = key;
                    startPoint = true;
                }    
            }
            
            if (value[0] >= 1 && value[1] == 0) {
                answer[2]++;
            }
            
            if (value[0] >= 2 && value[1] == 2) {
                answer[3]++;
            }
        }         
        
        answer[1] = inOut.get(answer[0])[1] - answer[2] - answer[3];
        
        return answer;
    }
}