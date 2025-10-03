public class WordSearch49 {
    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word)); // true
    }

    public static boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, int row, int col, String word, int index){
        // Base case: whole word matched
        if(index == word.length()){
            return true;
        }

        // Boundary and mismatch checks
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length) return false;
        if(board[row][col] != word.charAt(index)) return false;
        if(board[row][col] == '@') return false;

        // Mark current cell
        char c = board[row][col];
        board[row][col] = '@';

        // Explore 4 directions
        boolean result =
           dfs(board, row - 1, col, word, index + 1) ||
           dfs(board, row + 1, col, word, index + 1) ||
           dfs(board, row, col - 1, word, index + 1) ||
           dfs(board, row, col + 1, word, index + 1);

        // Backtrack
        board[row][col] = c;

        return result;
    }
}
