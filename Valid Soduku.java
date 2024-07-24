public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char current_char = board[i][j];
                if(current_char != '.')
                {
                    if(!seen.add(current_char + "found in row" + i) || 
                       !seen.add(current_char + "found in column" + j) || 
                       !seen.add(current_char + "found at box" + i/3 + " and " + j/3)){ return false;}
                }
            }
        }
        return true;
    }