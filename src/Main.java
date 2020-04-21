/*
  Jayson Peralta
  HW08 - CS411
  */
import java.util.*;
import java.io.*;
public class Main {
    // Private that is Constant for exit
    private static final int EXIT = 4;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Trip> trip = datasource.getTrip();
        List<Customer> customers = datasource.getCustomers();
        List<Reservation> reservations = datasource.getReservations();
        List<Guide> guides = datasource.getGuide();

        int selection = 0;
        while (selection != EXIT) { // It will not stop the program until you enter 4 which is the exit.
            // Print the Header and promptUserDisplay
            printHeader();
            promptUserDisplay();
            // User enter a selection 1 to 3
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Enter Costumer Num");
                    String customerNumber = input.next();
                    if (trip == null && customers == null && reservations == null) {
                        System.out.println("No trips!");
                        return;
                    }

                    System.out.printf("%-16s%-15s%-15s%n", "CustomerNum", "TripName", "TripDate");
                    System.out.printf("%-16s%-15s%-15s%n", "---------", "--------", "---------");

                    for (Customer ct : customers){
                        for (Trip tr : trip) {
                            for (Reservation rv : reservations) {
                                if(ct.getCustomerNum().equals(customerNumber)) {
                                    System.out.print(ct.getCustomerNum() + " " + tr.getTripName() + " " + " " + rv.getTripDate() + "\n");
                                }else if(customerNumber.equals("*")){
                                    System.out.print(ct.getCustomerNum() + " " + tr.getTripName() + " " + " " + rv.getTripDate() + "\n");
                                } else if(!(ct.getCustomerNum().equals(customerNumber))) {
                                    System.out.println("No such customer");
                                }
                            }
                        }
                    }

                    datasource.close();
                    // 1.	Show trips made by a customer.
                    break;
                case 2:
                    System.out.printf("%-15s%-15s%n", "TripName", "TotalRevenue");
                    System.out.printf("%-15s%-15s%n", "--------", "-----------");
                    for (Trip tr : trip) {
                        for (Reservation rv : reservations) {
                            System.out.print(tr.getTripName() + " " + " " + rv.getTripDate() + "\n");
                        }
                    }
                    // 2.	Show top five tours with most revenue. The revenue is calculated by adding the trip price and other fees for each reservation.
                    break;
                case 3:
                    System.out.println("Enter Costumer Num");
                    String customerNum = input.next();
                    if (trip == null && customers == null && reservations == null) {
                        System.out.println("No trips!");
                        return;
                    }

                    System.out.printf("%-16s%-15s%-15s%n", "CustomerNum", "GuideName", "TripDate");
                    System.out.printf("%-16s%-15s%-15s%n", "---------", "--------", "---------");

                    for (Customer ct : customers){
                        for (Guide gd : guides) {
                            for (Reservation rv : reservations) {
                                if(ct.getCustomerNum().equals(customerNum)) {
                                    System.out.print(ct.getCustomerNum() + " " + gd.getFirstName() + " " + " " + rv.getTripDate() + "\n");
                                } else if(!(ct.getCustomerNum().equals(customerNum))) {
                                    System.out.println("No such customer");
                                }
                            }
                        }
                    }

                    datasource.close();
                    // 3.	Show customers and guides who led tours for the customer.
                    break;
                case 4:
                    exit(); // exit() Method
                    break;
                default:
                    System.out.println("Your choice doesn't exist ");
            }
        }
    }
    // Method that print the Header
    public static void printHeader(){
        System.out.println("Main Menu");
        System.out.println("---------");
    }
    // Method that print the prompt user display
    public static void promptUserDisplay() {
        System.out.println("Enter 1 Show trips made by a customer");
        System.out.println("Enter 2 Show top five tours with most revenue. The revenue is calculated by adding the trip price and other fees for each reservation");
        System.out.println("Enter 3 Show customers and guides who led tours for the customer");
        System.out.println("Enter 4 Quit");
        System.out.println("Enter your choice");
    }
    // Method that exit the program
    public static void exit() {
        System.out.println("Goodbye. Thanks for using PeraltaTourCompany ");
        System.exit(0);
    }
}