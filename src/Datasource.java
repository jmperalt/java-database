

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    // public static final String URL = "jdbc:sqlite:e:/work/sqlite/db/course.db";
    //  C:/Users/jayso/Desktop/CS411 Database/sqlitefiles/courseapp/db/course.db"
    // C:/work/courseapp/db/course.db
    //C:/work/sqlite/jmperalt-db/colonial.db
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
      //  String queryTrip = "FROM Trip INNER JOIN (Customer INNER JOIN Reservation ON Customer.CustomerNum = Reservation.CustomerNum) ON Trip.TripID = Reservation.TripID;";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM Trip;")) {
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
    //    String queryCustomer = "FROM Trip INNER JOIN (Customer INNER JOIN Reservation ON Customer.CustomerNum = Reservation.CustomerNum) ON Trip.TripID = Reservation.TripID;";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM Customer;")) {
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
    //    String queryReservation = "FROM Trip INNER JOIN (Customer INNER JOIN Reservation ON Customer.CustomerNum = Reservation.CustomerNum) ON Trip.TripID = Reservation.TripID;";
        try(Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM Reservation;")) {
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
}
