
import java.util.*;

public class Player {
    char symbol;
    public Player(char symbol){
        this.symbol = symbol;
    }

    public void makeMove(Board board){
        int n = board.size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Player " + this.symbol + " to make a move!");
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(i >= n || j >= n || i < 0 || j < 0 || board.get(i, j) == 'X' || board.get(i, j) == 'O') {
            System.out.println("Invalid move! Please try again.");
            this.makeMove(board);
        } else {
            board.set(i, j, this.symbol);
        }
    }
    
}
