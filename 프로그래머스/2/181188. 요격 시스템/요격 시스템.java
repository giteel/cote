import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int mark1 = 0;
        int mark2 = 0;
        
        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];     
            }
        });
        
        for (int[] target : targets) {
            if (target[0] >= mark2) {
                answer++;
                mark1 = target[0];
                mark2 = target[1];
            } else {
                mark1 = Math.max(mark1, target[0]);
                mark2 = Math.min(mark2, target[1]);
            }
        }
        
        
        return answer;
    }
}