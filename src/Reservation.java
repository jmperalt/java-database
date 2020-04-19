public class Reservation {

    private String reservationID;
    private double tripID;
    private String tripDate;
    private double numPersons;
    private double tripPrice;
    private double otherFees;
    private String customerNum;

    public String getReservationID() {
        return reservationID;
    }
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }
    public double getTripID() {
        return tripID;
    }
    public void setTripID(double tripID) {
        this.tripID = tripID;
    }
    public String getTripDate() {
        return tripDate;
    }
    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }
    public double getNumPersons(){
        return numPersons;
    }
    public void setNumPersons(double numPersons){
        this.numPersons = numPersons;
    }
    public double getTripPrice(){
        return tripPrice;
    }
    public void setTripPrice(double tripPrice){
        this.tripPrice = tripPrice;
    }
    public double getOtherFees(){
        return otherFees;
    }
    public void setOtherFees(double otherFees){
        this.otherFees = otherFees;
    }
    public String getCustomerNum(){
        return customerNum;
    }
    public void setCustomerNum(String customerNum){
        this.customerNum = customerNum;
    }
}
