import Chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        clearTerminal();
        
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }

    private static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
