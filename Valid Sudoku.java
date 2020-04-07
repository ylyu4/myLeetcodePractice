class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char compare = board[i][j];
                board[i][j] = '#';
                
                if(compare == '.'){
                    continue;
                }else{
                    int r = 3 * (i/3);
                    int c = 3 * (j/3);
                    for(int k = 0; k < 9; k++){
                        if(board[i][k] == compare || board[k][j] == compare || board[r + k/3][c + k%3] == compare){
                            board[i][j] = compare;
                            return false;
                        }
                    }
                }
                board[i][j] = compare;
            }
        }
        return true;
        
    }
}