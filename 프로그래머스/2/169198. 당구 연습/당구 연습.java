class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        
        int idx = 0;
        for(int[] ball : balls ) {
            int value = 0;
            int left, up, right, down;
            int a = ball[0];
            int b = ball[1];
            
            left = (startX+a)*(startX+a) +
                (startY-b)*(startY-b);
            if (startY == b && startX > a) left = m*m+n*n;
            
            down = (startX-a)*(startX-a) +
                (startY+b)*(startY+b);
            if (startX == a && startY > b) down = m*m+n*n;
            
            right = ((m-startX)+(m-a))*((m-startX)+(m-a)) +
                (startY-b)*(startY-b);
            if (startY == b && startX < a) right = m*m+n*n;
            
            up = (startX-a)*(startX-a) + 
                ((n-startY)+(n-b))*((n-startY)+(n-b));
            if (startX == a && startY < b) up = m*m+n*n;
            
            value = left;
            if (value > down) value = down;
            if (value > right) value = right;
            if (value > up) value = up;
            
            answer[idx++] = value;
        }
        
        
        
        return answer;
    }
}