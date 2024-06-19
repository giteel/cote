import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<N; i++) {
            for (int j=0; j<i; j++) {
                sb.append(" ");
            }
            for (int j=i; j<N; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
    }
}