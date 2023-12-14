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
}
