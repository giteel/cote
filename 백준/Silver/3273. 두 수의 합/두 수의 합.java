import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        
        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] > x) break;
            
            int j = n - 1;
            while (i < j) {
                if (arr[i] + arr [j] > x) {
                    j--;
                } else if (arr[i] + arr[j] == x) {
                    count++;
                    break;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}