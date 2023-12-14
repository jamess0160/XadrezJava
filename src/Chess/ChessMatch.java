package Chess;

import Chess.Pieces.King;
import Chess.Pieces.Rook;
import boardGame.Board;
import boardGame.Position;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int r = 0; r < board.getRows(); r++) {
            for (int c = 0; c < board.getColumns(); c++) {
                mat[r][c] = (ChessPiece) board.getPiece(r, c);
            }
        }

        return mat;
    }

    private void initialSetup() {
        this.board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        this.board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        this.board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
