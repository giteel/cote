import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int[] abc = new int[3];
        abc[0] = Integer.parseInt(arr[0]);
        abc[1] = Integer.parseInt(arr[1]);       
        abc[2] = Integer.parseInt(arr[2]);
        int temp;
        
        for (int i=0; i<2; i++){
            for (int j=0; j<2-i; j++) {
                if (abc[j] > abc[j+1] ) {
                    temp = abc[j+1];
                    abc[j+1] = abc[j];
                    abc[j] = temp;
                }       
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(abc[0]).append(" ").append(abc[1]).append(" ").append(abc[2]);
        System.out.println(sb.toString());
    }
    
}