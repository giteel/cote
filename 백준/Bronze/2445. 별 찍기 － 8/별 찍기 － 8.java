import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<2*N; i++) {
            int diff = Math.abs(N-i);
            
            for(int j=1; j<=N-diff; j++) {
                sb.append("*");
            }
            for(int j=1; j<=2*(diff); j++) {
                sb.append(" ");
            }
            for(int j=1; j<=N-diff; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}