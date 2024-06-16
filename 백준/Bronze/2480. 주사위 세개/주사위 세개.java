import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] dice = br.readLine().split(" ");
        Arrays.sort(dice);
        
        int cnt = 1;
        int spot = 0;
        if (dice[0].equals(dice[1])) {
            spot = Integer.parseInt(dice[0]);
            if (dice[1].equals(dice[2])) cnt=3;
            else cnt=2;
        } else if (dice[0].equals(dice[2])) {
            spot = Integer.parseInt(dice[0]);
            cnt = 2;
        } else if (dice[1].equals(dice[2])) {
            spot = Integer.parseInt(dice[1]);
            cnt = 2;
        } else spot = Integer.parseInt(dice[2]);
        
        int answer = 0;
        if (cnt == 3) answer= 10000+spot*1000;
        else if (cnt == 2) answer = 1000+spot*100;
        else answer = spot*100;
        
        System.out.println(answer);
    }
}