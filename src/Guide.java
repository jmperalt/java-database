public class Guide {
/*
* (GuideNum CHAR(4) PRIMARY KEY,
LastName CHAR(15),
FirstName CHAR(15),
Address CHAR(25),
City CHAR(25),
State CHAR(2),
PostalCode CHAR(5),
PhoneNum CHAR(12),
HireDate DATE );
* */
    private String guideNum;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String phone;

    public String getGuideNum() {
        return guideNum;
    }
    public void setGuideNum(String guideNum) {
        this.guideNum = guideNum;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public void set(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPhone(){
        return  phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
