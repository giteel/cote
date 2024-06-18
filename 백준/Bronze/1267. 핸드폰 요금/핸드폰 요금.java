import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        int Y = 0;
        int M = 0;
        
        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(st.nextToken());
            
            Y += ((t/30)+1)*10;
            M += ((t/60)+1)*15;
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (Y < M) {
            sb.append("Y ").append(Y);    
        } else if (Y > M) {
            sb.append("M ").append(M);    
        } else {
            sb.append("Y M ").append(Y);   
        } 
        System.out.println(sb.toString());        
    }
}