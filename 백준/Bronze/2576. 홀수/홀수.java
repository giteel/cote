import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int min = 100;
        int sum = 0;
        String input = "";
        while ((input = br.readLine()) != null) {
            int a = Integer.parseInt(input);
            
            if (a % 2 == 0) continue;
            sum += a;
            if (a < min) min = a;
        }
        
        if (sum == 0) sum = -1;
        System.out.println(sum);
        if (sum != -1) System.out.println(min);
    }
}