package Chess;

import boardGame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {

        if (column < 'a' || column > 'h') {
            throw new ChessException("Inserted Collumn is out of bounds!");
        }

        if (row < 1 || row > 8) {
            throw new ChessException("Inserted Row is out of bounds!");
        }

        this.column = column;
        this.row = row;
    }

    public int getRow() {
        return this.row;
    }

    public char getColumn() {
        return this.column;
    }

    protected Position toPosition() {
        return new Position(8 - this.row, this.column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        char column = (char) ('a' - position.getCollumn());
        int row = 8 - position.getRow();

        return new ChessPosition(column, row);
    }

    @Override
    public String toString() {
        return "" + this.column + this.row;
    }
}
