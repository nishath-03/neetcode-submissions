class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=3;
        for(int i=0;i<n*n;i++){
            HashSet<Character> set_row = new HashSet<>();
            for(int j=0;j<n*n;j++){
                if(set_row.contains(board[i][j])&&Character.isDigit(board[i][j]))return false;
                else if(Character.isDigit(board[i][j])) set_row.add(board[i][j]);
            }
            HashSet<Character> set_col = new HashSet<>();
            for(int j=0;j<n*n;j++){
                if(set_col.contains(board[j][i]) && Character.isDigit(board[j][i]))return false;
                 else if(Character.isDigit(board[j][i])) set_col.add(board[j][i]);
            }
            
            
        }
        List<Integer> r = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<n;i++){
            r.add(i*3);
            c.add(i*3);
        }
        
        for(int i:r){
            for(int j:c){
                HashSet<Character>set1 = new HashSet<>();
                for(int k=i;k<i+n;k++){
                    for(int l = j;l<j+n;l++){
                        if(set1.contains(board[k][l])&&Character.isDigit(board[k][l]))return false;
                        else if(Character.isDigit(board[k][l])) set1.add(board[k][l]);
                    }
                }
            }
        }

        return true;
    }
}
