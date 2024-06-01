class Solution {
    int cnt, qMin, qMax;
    
    public int solution(int[][] land) {
        int answer = 0;
        int[] buried = new int[land[0].length];
        
        for (int i=0; i<land.length; i++) {
            for (int j=0; j<land[0].length; j++) {
                qMin = land[0].length;
                qMax = 0;
                cnt = 0;
                find(i, j, land);
                
                for (int k=qMin; k<=qMax; k++) {
                    buried[k] += cnt;
                }
            }
        }
        
        for (int i=0; i<buried.length; i++) {
            if (answer < buried[i]) answer=buried[i];
        }
        
        
        return answer;
    }
    
    public void find(int p, int q, int[][] land) {
        if (p<0 || p >= land.length || q<0 || q >= land[0].length ) return;
        if (land[p][q] != 1 ) return;
        
        cnt++;
        land[p][q] = -1;
        
        find(p+1, q, land);
        find(p-1, q, land);
        find(p, q+1, land);
        find(p, q-1, land);

        if (qMin > q) qMin= q;
        if (qMax < q) qMax = q;
        
        land[p][q] = cnt;
        return;
    }
}