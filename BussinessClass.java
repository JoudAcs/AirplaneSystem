package ja7.airplaneticketsreservation;

public class BussinessClass extends Seat {

    String BussinessClass;

    public BussinessClass(int row, int column) {
        super(row, column);
        this.BussinessClass = "Bussiness Class";
    }

    @Override
    public void displayClass() {
        System.out.println("Class is: " + BussinessClass);
    }
}
