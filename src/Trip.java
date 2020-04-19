public class Trip {

    private double tripID;
    private String tripName;
    private String startLocation;
    private String state;
    private double distance;
    private double maxGrpSize;
    private String type;
    private String season;

    public double getTripID() {
        return tripID;
    }
    public void setTripID(double tripID) {
        this.tripID = tripID;
    }

    public String getTripName() {
        return tripName;
    }
    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String geState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }

    public double getDistance(){
        return distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getMaxGrpSize(){
        return maxGrpSize;
    }
    public void setMaxGrpSize(double maxGrpSize){
        this.maxGrpSize = maxGrpSize;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getSeason(){
        return season;
    }
    public void setSeason(String season){
        this.season = season;
    }
}
