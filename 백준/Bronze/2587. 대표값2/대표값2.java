import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        
        int sum = 0;
        int[] arr = new int[5];
        
        for (int i=0; i<5; i++) {
            token = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(token.nextToken());
            sum += arr[i];
        }
        
        System.out.println(sum/5);
               
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}