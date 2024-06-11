import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int solution(int n, long l, long r) {
        int answer = 0;
        String kan = "11011";

        List<Integer> tablel = new ArrayList<>();
        List<Integer> tabler = new ArrayList<>();
        l--; r--;
        boolean fromOne = true;
        boolean canl = true, canr = true;
        long temp;
        while (l != r) {
            tablel.add((int) (l % 5));
            tabler.add((int) (r % 5));
            l /= 5;
            r /= 5;
        }

        temp = l;
        while (temp > 0) {
            if (temp % 5 == 2) {
                fromOne = false;
                break;
            }
            temp /= 5;
        }

        if (!fromOne) return 0;
        if (tablel.size() == 0) return 1;

        for (int i = tablel.get(tablel.size() - 1) + 1; i < tabler.get(tabler.size() - 1); i++) {
            if (kan.charAt(i) == '1') answer++;
        }
        if (tablel.get(tablel.size() - 1) == 2) canl = false;
        if (tabler.get(tabler.size() - 1) == 2) canr = false;

        for (int i = tablel.size() - 2; i >= 0; i--) {
            answer *= 4;
            if (canl) {
                for (int j = tablel.get(i) + 1; j < 5; j++) {
                    if (kan.charAt(j) == '1') answer++;
                }
                if (tablel.get(i) == 2) canl = false;
            }

            if (canr) {
                for (int j = 0; j < tabler.get(i); j++) {
                    if (kan.charAt(j) == '1') answer++;
                }
                if (tabler.get(i) == 2) canr = false;
            }
        }

        if (canl && tablel.get(0) != 2) answer++;
        if (canr && tabler.get(0) != 2) answer++;

        return answer;
    }
}