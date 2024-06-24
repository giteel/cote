import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        br.close();
        
        int[] answer = new int[26];
        
        for (int i=0; i<s.length(); i++) {
            answer[s.charAt(i) - 'a']++;
        }
        
        for (int i=0; i<26; i++) {
            sb.append(answer[i]).append(" ");
        }
               
        bw.write(sb.toString());
        bw.flush();
        
    }
}