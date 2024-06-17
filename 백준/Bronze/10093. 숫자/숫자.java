import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        
        if (max == min) {
           System.out.println(0);
        } else {
            System.out.println(max-min-1); 
            for (long i=min+1; i<max; i++) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        
        
        
        
    }
}