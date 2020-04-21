public class TripGuides {
    /*
    * (TripID DECIMAL(3,0),
GuideNum CHAR(4),
PRIMARY KEY (TripID, GuideNum) );*/

    private double tripID;
    private String guideNum;

    public double getTripID() {
        return tripID;
    }
    public void setTripID(double tripID) {
        this.tripID = tripID;
    }

    public String getGuideNum() {
        return guideNum;
    }
    public void setTripName(String guideNum) {
        this.guideNum = guideNum;
    }
}
