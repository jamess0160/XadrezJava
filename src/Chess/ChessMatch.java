package Chess;

import Chess.Pieces.King;
import Chess.Pieces.Rook;
import boardGame.Board;

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

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        this.board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        this.initiateColorSetup(1);
        this.initiateColorSetup(8);
    }

    private void initiateColorSetup(int initialRow) {
        // Rooks
        this.placeNewPiece('a', initialRow, new Rook(board, Color.WHITE));
        this.placeNewPiece('h', initialRow, new Rook(board, Color.WHITE));

        // King
        this.placeNewPiece('e', initialRow, new King(board, Color.WHITE));

    }
}