import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] cards = new int[20];
        for (int i=0; i<20; i++) cards[i] = i+1;
        
        for (int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a, b;
            a = Integer.parseInt(st.nextToken()) - 1;
            b = Integer.parseInt(st.nextToken()) - 1;
            int m = (a + b) / 2;
            
            for(int j=0; j<=m-a; j++) {
                if (a+j != b-j) {
                    int t = 0;
                    t = cards[b-j];
                    cards[b-j] = cards[a+j];
                    cards[a+j] = t;    
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<20; i++) {
            sb.append(cards[i]).append(" ");
        }
        
        System.out.println(sb.toString()); 
    }
}