import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] check; 
        
        for (int i=0; i<N; i++) {
            check = new int[26];
            st= new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            
            for(int j=0; j<str1.length(); j++) {
                check[str1.charAt(j) - 'a']++;
            }
            
            String str2 = st.nextToken();
            
            for (int j=0; j<str2.length(); j++) {
                check[str2.charAt(j) - 'a']--;
            }
            String result = "Possible";
            for (int j=0; j<26; j++) {
                if (check[j] != 0) {
                    result = "Impossible";
                    break;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}