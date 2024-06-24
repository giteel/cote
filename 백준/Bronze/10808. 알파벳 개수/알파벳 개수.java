import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        br.close();
        int[] answer = new int[26];
        
        for (char c : arr) {
            int a =  ((int) c) - 97;
            answer[a]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            sb.append(a).append(" ");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        
    }
}