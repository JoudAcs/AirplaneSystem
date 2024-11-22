package ja7.airplaneticketsreservation;

public class FirstClass extends Seat {

    String firstClass;

    public FirstClass(int row, int column) {
        super(row, column);
        this.firstClass = "First Class";
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    @Override
    public void displayClass() {
        System.out.println("Class is: " + firstClass);
    }
}
