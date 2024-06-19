import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);
        
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        //StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st.nextToken();
        int T = (int)st.nval;
        
        for(int i=0; i<T; i++) {
        
        //    int a, b;
        //    st = new StringTokenizer(br.readLine());
        //    a = Integer.parseInt(st.nextToken());
        //    b = Integer.parseInt(st.nextToken());
            st.nextToken();
            int a = (int)st.nval;
            st.nextToken();
            int b = (int)st.nval;
            sb.append(a+b).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}