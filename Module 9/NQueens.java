import java.util.*;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(board, 0, result);
        return result;
    }

    private void backtrack(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(buildSolution(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(board, row + 1, result);
                board[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        int n = board.length;
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }

    private List<String> buildSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) solution.add(new String(row));
        return solution;
    }

    public static void main(String[] args) {
        NQueens obj = new NQueens();
        List<List<String>> solutions = obj.solveNQueens(4);
        for (List<String> sol : solutions) {
            for (String row : sol) System.out.println(row);
            System.out.println("---");
        }
    }
}
