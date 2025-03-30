public class Game {
    Board board;
    Player player1;
    Player player2;

    public Game(int size){
        this.board = new Board(size);
        this.player1 = new Player('X');
        this.player2 = new Player('O');
    }

    public void launch() {
        int n = this.board.size;
        int turns = n*n;
        board.print();
        while(turns > 0){

            player1.makeMove(board);
            turns--;
            board.print();
            if(board.isWinner(player1.symbol)){
                System.out.println("Player" + player1.symbol + " has won the game!!");
                break;
            }
            if(turns <= 0){
                System.out.println("The game ended in a draw!");
                break;
            }
            player2.makeMove(board);
            turns--;
            board.print();
            if(board.isWinner(player2.symbol)){
                System.out.println("Player" + player2.symbol + " has won the game!!");
                break;
            }
            if(turns <= 0){
                System.out.println("The game ended in a draw!");
                break;
            }
        }
    }
}
