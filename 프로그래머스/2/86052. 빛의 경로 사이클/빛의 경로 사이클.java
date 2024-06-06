import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    int[][] direction = {{0,-1}, {0,1}, {-1,0},{1,0}};
    Set<String> set = new HashSet<String>();
    String[][] coord;
    int count;
    
    public int[] solution(String[] grid) {
        coord = new String[grid.length][grid[0].length()];
        
        for (int i=0; i<grid.length; i++) {
            coord[i] = grid[i].split("");
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i=0; i< coord.length; i++) {
            for (int j=0; j< coord[0].length; j++) {
                
                for (int[] dir: direction) {
                    int[] pq = {i, j};
                    count = 0;
                    
                    cycle(pq, dir);
                    if (count != 0) {
                        list.add(count);   
                    }
                }
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i).intValue();
            
            
        
        return answer;
    }
    
    public void cycle(int[] pq, int[] dir) {
        
        while (true) {
            int length = dir[0] == 0 ? coord[0].length : coord.length;
            int[] new_pq = check(pq, dir, length);
            
            String edge = String.valueOf(pq[0]) + " " + String.valueOf(pq[1]) + " " + String.valueOf(new_pq[0]) + " " + String.valueOf(new_pq[1]) + " " + String.valueOf(dir[0]) + " " + String.valueOf(dir[1]);
            
            if (!set.contains(edge)) {
                set.add(edge);
                count++;

                int[] new_dir = SLR(dir, coord[new_pq[0]][new_pq[1]]);

                
                pq = new_pq;
                dir = new_dir;
                //cycle(new_pq, new_dir);
            } else {
                break;
            }
        }
    }
    
    public int[] check(int[] pq, int[] dir, int length) {
        int[] new_pq = new int[2];
        
        if (dir[0] != 0 ) {
            if (pq[0]+dir[0] == length || pq[0]+dir[0] == -1){
                int p = length - (pq[0]+1);
                new_pq = new int[]{p, pq[1]};
            } else {
                new_pq = new int[]{pq[0]+dir[0], pq[1]+dir[1]};
            }
        } else if (dir[1] != 0) {
            if (pq[1]+dir[1] == length || pq[1]+dir[1] == -1){
                int q = length - (pq[1]+1);
                new_pq = new int[]{pq[0], q};
            } else {
                new_pq = new int[]{pq[0]+dir[0], pq[1]+dir[1]};
            } 
        }
        
        return new_pq;
    }
    
    public int[] SLR(int[] dir, String next) {
        if (dir[0] == 0) {
            if (next.equals("L")) {
                dir = new int[]{-1*dir[1], 0};
            } else if (next.equals("R")) {
                dir = new int[]{dir[1], 0};
            }
        } else if (dir[1] == 0) {
            if (next.equals("L")) {
                dir = new int[]{0, dir[0]};
            } else if (next.equals("R")) {
                dir = new int[]{0, -1*dir[0]};
            }
        }
        return dir;
    }
}