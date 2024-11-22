package ja7.airplaneticketsreservation;

public class EconomicClass extends Seat {

    String EconomicClass;

    public EconomicClass(int row, int column) {
        super(row, column);
        this.EconomicClass = "Economic Class";
    }

    @Override
    public void displayClass() {
        System.out.println("Class is: " + EconomicClass);
    }
}
