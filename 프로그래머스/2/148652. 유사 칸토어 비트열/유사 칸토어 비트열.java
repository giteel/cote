

class Solution {
    public int solution(int n, long l, long r) {
        int answer = 0;
        
        for ( l--; l<r; l++) {
            if (check(l)) answer++;
        }
        
        return answer;
    }
    
    public boolean check(long l) {
        if (l % 5 == 2) return false;
        if (l < 5 ) return true;
        
        return ( check(l / 5));
    }
}