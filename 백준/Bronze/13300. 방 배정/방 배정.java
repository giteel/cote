import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] w_grade = new int[6];
        int[] m_grade = new int[6];
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String mw = st.nextToken();
            int grade = Integer.parseInt(st.nextToken());
            if (mw.equals("0")) {
                w_grade[grade]++;
            } else {
                m_grade[grade]++;
            }
        }
        int count = 0;
        for(int i=0; i<6; i++) {
            count += (w_grade[i] + K - 1 ) / K;
            count += (m_grade[i] + K - 1 ) / K;
        }
        System.out.print(count);
    }
}