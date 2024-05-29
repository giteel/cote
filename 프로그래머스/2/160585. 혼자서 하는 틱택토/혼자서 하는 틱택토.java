class Solution {
    public int solution(String[] board) {
        //int answer = 0;
        
        int cnt_O = 0;
        int cnt_X = 0;
        
        for (String row : board) {
            for (int i=0; i<row.length(); i++) {
                if (row.charAt(i) == 'O') cnt_O++;
                if (row.charAt(i) == 'X') cnt_X++;
            }
        }
        // if ( cnt_x <= cnt_O && cnt_O <= cnt_X+1 )
        if ( cnt_X > cnt_O || cnt_O > cnt_X+1 ) return 0;
        if ( cnt_O == 0 && cnt_X == 0) return 1;
        
        int cnt_row = 0;
        for (String row : board) {
            if (row.charAt(0) == row.charAt(1) && row.charAt(1) == row.charAt(2)) {
                if (row.charAt(0) == 'O' && cnt_O == cnt_X) return 0;
                if (row.charAt(0) == 'X' && cnt_O > cnt_X) return 0;
                cnt_row++;
            }
        }
        if (cnt_row >= 2) return 0;
        
        int cnt_col = 0;
        for (int i=0; i<board.length; i++) {
            if ( board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i) ) {
                if (board[0].charAt(i) == 'O' && cnt_O == cnt_X) return 0;
                if (board[0].charAt(i) == 'X' && cnt_O > cnt_X) return 0;
                cnt_col++;  
            } 
        }
        if (cnt_col >= 2) return 0;
        
        if (board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2)) {
            if ( board[1].charAt(1) == 'O' && cnt_O == cnt_X ) return 0;
            if ( board[1].charAt(1) == 'X' && cnt_O > cnt_X ) return 0;
        } else if ( board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0) ) {
            if ( board[1].charAt(1) == 'O' && cnt_O == cnt_X ) return 0;
            if ( board[1].charAt(1) == 'X' && cnt_O > cnt_X ) return 0;
        }
        
        return 1;
    }
}