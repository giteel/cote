import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] arr = br.readLine().split(" ");
        
        System.out.println( Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0])-Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0])*Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0])/Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0])%Integer.parseInt(arr[1]));
    }
}