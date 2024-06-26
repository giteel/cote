import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for (int i=0; i<N; i++) {
            int key = Integer.parseInt(st.nextToken());
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        
        int v = Integer.parseInt(br.readLine());
        
        System.out.print(hm.getOrDefault(v, 0));
    }
}