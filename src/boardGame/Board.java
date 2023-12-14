package boardGame;

public class Board {
    private int rows;
    private int collumns;

    private Piece[][] pieces;

    public Board(int rows, int collumns) {
        this.rows = rows;
        this.collumns = collumns;
        this.pieces = new Piece[rows][collumns];
    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return this.collumns;
    }

    public void setColumns(int collumns) {
        this.collumns = collumns;
    }

    public Piece getPiece(int row, int column) {
        return this.pieces[row][column];
    }

    public Piece getPiece(Position position) {
        return this.pieces[position.getRow()][position.getCollumn()];
    }

    public void placePiece(Piece piece, Position position){
        this.pieces[position.getRow()][position.getCollumn()] = piece;
        piece.position = position;
    }
}
