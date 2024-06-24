import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] answer = new int[10];
        
        int abc = (Integer.parseInt(br.readLine()))*(Integer.parseInt(br.readLine()))*(Integer.parseInt(br.readLine()));
        String str = String.valueOf(abc);
        
        while(abc > 0) {
            answer[abc % 10]++;
            abc /= 10;
        }
        
        for(int i=0; i<10; i++) {
            sb.append(answer[i]).append("\n");
        }
        
        System.out.print(sb);
        
    }
}