import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        for (int i=0; i<str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
        }
        
        for (int i=0; i<str2.length(); i++) {
            arr[str2.charAt(i) - 'a']--;
        }
        
        int count =0;
        for (int i=0; i<26; i++) {
            count += Math.abs(arr[i]);
        }
        
        System.out.print(count);
    }
}