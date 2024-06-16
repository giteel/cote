import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count=0;
        while(count<3) {
            String[] str = br.readLine().split(" ");
            
            int cnt= 0;
            for (String s : str) {
                if (s.equals("0")) cnt++;
            }
            if (cnt == 4) System.out.println("D");
            else if (cnt == 3) System.out.println("C");
            else if (cnt == 2) System.out.println("B");
            else if (cnt == 1) System.out.println("A");
            else System.out.println("E");
            
            count++;
        }
    }
}