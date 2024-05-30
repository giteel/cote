class Solution {
    public int[] solution(int[] sequence, int k) {
        int s= 0; int e = sequence.length-1;
        int sum = 0;
        int p = 0;
        for (int i=0; i<sequence.length; i++) {
            while ( sum < k && p < sequence.length) {
                sum += sequence[p];
                p++;
            }
            
            if (sum == k ) {
                if ( e - s > p - i - 1) {
                    s = i; e = p - 1;
                }   
            }
            
            sum -= sequence[i];
            
        }
        
        return new int[]{s, e};
    }
}