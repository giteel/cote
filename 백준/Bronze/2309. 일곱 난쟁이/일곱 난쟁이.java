import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[9];
        
        for(int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int total = 0;
        for (int i=0; i<9; i++) total += arr[i];
        int except = total - 100;
        boolean terminate = false;
        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if (arr[i]+arr[j] == except) {
                    arr[i] = arr[j] = 0;
                    terminate = true;
                    break;
                }
            }
            if (terminate) break;
        }
        
        
        for (int i=0; i<9; i++) {
            if (arr[i] != 0) System.out.println(arr[i]); 
        }
    }
}