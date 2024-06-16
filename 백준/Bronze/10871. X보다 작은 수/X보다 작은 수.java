import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt(); 
        
        int[] arr = new int[N];
        
        IntStream.range(0, N).forEach(i -> arr[i] = sc.nextInt());
        
        sc.close();
        
        IntStream.of(arr)
            .filter(num -> num < X)
            .forEach(num -> System.out.print(num + " "));
    }
}