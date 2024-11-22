package ja7.airplaneticketsreservation;

public abstract class Seat {
    protected int row;
    protected int column;

    public Seat() {}

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public abstract void displayClass();

    String Seat = "row:" + row + " column:" + column;

    @Override
    public String toString() {
        return Seat;
    }
}

