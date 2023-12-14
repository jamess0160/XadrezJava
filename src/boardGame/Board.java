package boardGame;

public class Board {
    private int rows;
    private int collumns;

    private Piece[][] pieces;

    public Board(int rows, int collumns) {

        if (rows < 1 || collumns < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column!");
        }

        this.rows = rows;
        this.collumns = collumns;
        this.pieces = new Piece[rows][collumns];
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.collumns;
    }

    public Piece getPiece(int row, int column) {
        if (!this.positionExists(row, column)) {
            throw new BoardException("This position does not exists!");
        }

        return this.pieces[row][column];
    }

    public Piece getPiece(Position position) {
        if (!this.positionExists(position)) {
            throw new BoardException("This position does not exists!");
        }

        return this.pieces[position.getRow()][position.getCollumn()];
    }

    public void placePiece(Piece piece, Position position) {

        if (thereIsAPiece(position)) {
            throw new BoardException("Theres already a piece on position " + position);
        }

        this.pieces[position.getRow()][position.getCollumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int collumn) {
        if (row < 0) {
            return false;
        }

        if (collumn < 0) {
            return false;
        }

        if (row > this.rows) {
            return false;
        }

        if (collumn > this.collumns) {
            return false;
        }

        return true;
    }

    public boolean positionExists(Position position) {
        return this.positionExists(position.getRow(), position.getCollumn());
    }

    public boolean thereIsAPiece(Position position) {
        if (!this.positionExists(position)) {
            throw new BoardException("This position does not exists!");
        }

        return this.getPiece(position) != null;
    }
}
