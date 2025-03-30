public class Board {

    int size;
    char[][] board;
    public Board(int size){
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.board[i][j] = '_';
            }
        }
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char get(int i, int j) {
        return this.board[i][j];
    }

    public void set(int i, int j, char val) {
        this.board[i][j] = val;
    }

    public boolean isWinner(char sym) {
        if(checkRows(sym) || checkCols(sym) || checkDiagonals(sym)) {
            return true;
        }
        return false;
    }

    private boolean checkRows(char sym) {
        for(int i = 0; i < size ; i++) {
            if(checkRow(i, sym)) return true;
        }
        return false;
    }

    private boolean checkRow(int row, char sym) {
        for (int i = 0; i < size; i++) {
            if(this.board[row][i] != sym) return false;
        }
        return true;
    }

    private boolean checkCols(char sym){
        for (int i = 0; i < size; i++) {
            if(checkCol(i, sym)) return true;
            
        }
        return false;
    }

    private boolean checkCol(int col, char sym) {
        for (int i = 0; i < size; i++) {
            if(this.board[i][col] != sym) return false;
        }
        return true;
    }

    private boolean checkDiagonals(char sym) {
        return checkDiag1(sym) || checkDiag2(sym);
    }

    private boolean checkDiag1(char sym) {
        int i = 0, j = 0, n = this.size;
        while(i < n && j < n) {
            if(this.board[i][j] != sym) return false;
            i++;
            j++;
        }
        return true;
    }

    private boolean checkDiag2(char sym) {
        int n = size;
        int j = n-1, i = 0;
        while (j >= 0 && i < n) {
            if(this.board[i][j] != sym) return false;
            i++;
            j--;
        }
        return true;
    }

}