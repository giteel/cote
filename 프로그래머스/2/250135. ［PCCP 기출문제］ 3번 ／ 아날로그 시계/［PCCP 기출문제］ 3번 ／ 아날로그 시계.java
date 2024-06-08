class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = count(h2, m2, s2) - count(h1, m1, s1);
        
        // h1:m1:s1이 0시0분0초나 12시0분0초일 경우는 ++;
        if ( (h1==0||h1==12) && m1 == 0 && s1 == 0) answer++;
        
        return answer;
    }
    
    // 0시 0분 0초 ~  h시 h분 h초 까지 횟수
    public int count(int hh, int mm, int ss) {
        int result = 0;
        double sHand, mHand, hHand;
        double h = (double) hh;
        double m = (double) mm;
        double s = (double) ss;
        
        // 초, 분, 시침 각도
        sHand = s*6;
        mHand = (m*6)+6*(s/60);
        hHand = (h*30+30*(m/60)+(30/60/60)*s)%360;
        
        // 초침은 시침과 분침을 각각 분 당 한 번씩 만남
        result += (h*60+m)*2;
        
        // 59분 ~ 60분일 때는 분침과 만나지 않음.
        result -= h;
        
        // 0시 0분 0초일 때는 시분초 한 번에 만남.
        result--;
        
        // 12시 넘어갈 때, 12시 0분 0초 케이스 제외
        if (h>=12) result--;
        
        // 11시 59분 ~ 12시 0분 일 때 시침과 초침 만나지 않음
        if (h>=12) result--;
        
        // 자투리 초 시간 처리
        if (sHand >= mHand) result++;
        if (sHand >= hHand) result++;
        
        return result;
    }
}