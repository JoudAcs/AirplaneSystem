package ja7.airplaneticketsreservation;

import java.io.File;
import java.util.Scanner;

public class TicketPrinting {
    String userName;
    String personalID;
    String destinationCity;
    String travelData;
    String travelTime;

    @Override
    public String toString() {
        return "\n******************************************************"
                + "\nPersonal Information:- "
                + "\nName: " + this.userName
                + "\nPersonalID: " + this.personalID
                + "\n---------------------"
                + "\nTravel Information:- "
                + "\nDestination: " + this.destinationCity
                + "\nDate: " + this.travelData
                + "\nTime: " + this.travelTime
                + "\n******************************************************";
    }

    public void importData() {
        File fileName = new File("dataFile.txt");

        try {
            Scanner inputStream = new Scanner(fileName);
            String ticketData = inputStream.nextLine();

            String[] info = ticketData.split(",");
            this.userName = info[0];
            this.personalID = info[1];
            this.destinationCity = info[2];
            this.travelData = info[3];
            this.travelTime = info[4];

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
