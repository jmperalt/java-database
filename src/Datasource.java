import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    public static final String URL = "jdbc:sqlite:C:/work/sqlite/jmperalt-db/colonial.db";
    private Connection conn;
    public boolean open() {
        try {
            conn = DriverManager.getConnection(URL);
            return true;
        } catch(SQLException e) {
            System.out.println("Couldn't connect to database: " +
                    e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public List<Trip> getTrip() {
       String queryTrip = "Trip";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM " + queryTrip)) {
            List<Trip> trip = new ArrayList<>();
            while(results.next()) {
                Trip tr = new Trip();
                tr.setTripName(results.getString(2));
                trip.add(tr);
            }
            return trip;
        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }
    public List<Customer> getCustomers() {
       String queryCustomer = "Customer";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM " + queryCustomer)) {
            List<Customer> customers = new ArrayList<>();
            while(results.next()) {
                Customer ct = new Customer();
                ct.setCustomerNum(results.getString(1));
                customers.add(ct);
            }
            return customers;
        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
    public List<Reservation> getReservations() {
        String queryReservation = "Reservation";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM " + queryReservation)) {
            List<Reservation> reservations = new ArrayList<>();
            while(results.next()) {
                Reservation rv = new Reservation();
                rv.setTripDate(results.getString(3));
                reservations.add(rv);
            }
            return reservations;
        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
    public List<Guide> getGuide() {
        String queryGuide =  "Guide";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM " + queryGuide)) {
            List<Guide> guides = new ArrayList<>();
            while(results.next()) {
                Guide rv = new Guide();
                rv.setFirstName(results.getString(3));
                guides.add(rv);
            }
            return guides;
        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
}