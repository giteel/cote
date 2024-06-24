import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        br.close();
        
        int[] answer = new int[26];
        
        for (int i=0; i<s.length(); i++) {
            answer[s.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            sb.append(a).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        
    }
}