package ja7.airplaneticketsreservation;

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class AirplaneTicketsReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*******************|Ô£ê Welcom to Air ticket booking system Ô£ê|*******************");
        Company CompanyInformation = new Company();
        System.out.println(CompanyInformation);

        System.out.println("\nIf you are sure that you want to book ,please write \"yes\"");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            System.out.println("Add your UserName");
            String UserName = input.nextLine();
            System.out.println("Add your EmailAddres");
            String EmailAddres = input.next();
            System.out.println("Add your DateOfBirth");
            String DateOfBirth = input.next();

            //Exception
            String UserNumber = "";
            int UserNumberToInt = 0;
            try {
                System.out.println("Add your your PhoneNumber");
                UserNumber = input.next();
                if (UserNumber.length() != 10)
                    System.out.println("Sorry, you have to enter 10 digits not more or less than that");
                
                UserNumberToInt = Integer.parseInt(UserNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error... " + e.getMessage());
            }

            System.out.println("Add your PersonalID");
            int PersonalID = input.nextInt();

            CustomerInformation Information = new CustomerInformation(UserName, EmailAddres, DateOfBirth, UserNumberToInt, PersonalID);

            System.out.println("write the citythat you want to travel to");
            String city = input.next();
            City yourDirection = new City(city);
            
            int day = 0, month = 0, year = 0; // 0 is a default value, no more
            try{
                System.out.println("Now we need you to provide us with the your flight date"
                        + "\nWhat's the day? (as a number please)");
                day = input.nextInt();
                System.out.println("What's the month?");
                month = input.nextInt();
                System.out.println("What's the year?");
                year = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }

            Date yourDate = new Date(day, month, year);
            
            int hour = 0, minute = 0;
            try{
                System.out.println("please provide us with the flight time is "
                        + "\n the hour ?");
                hour = input.nextInt();
                System.out.println("the minute?");
                minute = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }
            Time yourTime = new Time(hour, minute);
            
            // To save data in the file
            String dataToSave = (UserName + "," + PersonalID + "," + yourDirection.getCityName() + "," + yourDate + "," + yourTime);
            saveData(dataToSave);
            
            System.out.println("choos one number for this: ");
            System.out.println("1 - BussinessClass");
            System.out.println("2 - FirstClass");
            System.out.println("3 - EconomicClass");
            int choose = input.nextInt();

            Random rand = new Random();

            int[] array = new int[2];
            for (int index = 0; index < array.length; index++) {
                array[index] = rand.nextInt(101);
            }

            int row, column;
            switch (choose) {
                case 1:
                    row = array[0];
                    column = array[1];
                    BussinessClass ysB = new BussinessClass(row, column);
                    // ysB= it's mean your set in Bussiness class
                    break;

                case 2:
                    row = array[0];
                    column = array[1];
                    FirstClass ysF = new FirstClass(row, column);
                    // ysF= it's mean your set in First class
                    break;

                case 3:
                    row = array[0];
                    column = array[1];
                    EconomicClass ysC = new EconomicClass(row, column);
                    // ysC= it's mean your set in Economic class
                    break;

                default:
                    System.out.println("your choose is false");
            }

            // Print Ticket
            TicketPrinting Print = new TicketPrinting();
            Print.importData();
            System.out.println(Print);

            //Program evaluation
            System.out.println("\nRate the program stars (*) from 1 - 5");
            System.out.print("1 star ÔåÆ strongly unsatisfied.\n2 stars ÔåÆ unsatisfied.\n3 stars ÔåÆ satisfied.\n4 stars ÔåÆ strongly satisfied.\n5 stars ÔåÆ outstanding.\n");
            String stars = input.next();

            System.out.println("Your rating for the program is : " + stars);
            System.out.println("Thank you for your time, we are happy to help you. ");

        } else {
            System.out.println("Sorry we can't help you");
        }
    }

    // To save data that passed to the file named 'dataFile.txt'
    public static void saveData(String dataToSave){
        File fileName = new File("dataFile.txt");
        
        try{
            PrintWriter outputStream = new PrintWriter(fileName);
            outputStream.println(dataToSave);
            outputStream.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

