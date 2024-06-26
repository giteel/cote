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
        boolean[] nums = new boolean[1000001];
        for (int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            nums[temp]= true;
        }
        int x = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i=0; i<n; i++) {
            int temp = x - arr[i];
            if (temp >0 && temp <= 1000000 && nums[temp] ) count++;
        }
        System.out.println(count/2);
    }
}