package boardGame;

public class Position {
    private int row;
    private int collumn;

    public Position(int row, int collumn) {
        this.row = row;
        this.collumn = collumn;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCollumn() {
        return this.collumn;
    }

    public void setCollumn(int collumn) {
        this.collumn = collumn;
    }

    @Override
    public String toString() {
        return this.row + ", " + this.collumn;
    }
}
