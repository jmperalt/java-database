public class Customer {
/*
* (guideNum CHAR(4) PRIMARY KEY,
LastName CHAR(30) NOT NULL,
FirstName CHAR (30),
Address CHAR(35),
City CHAR(35),
State CHAR(2),
PostalCode CHAR(5),
phoneNum CHAR(12) );*/
    private String customerNum;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String phoneNum;

    public String getCustomerNum() {
        return customerNum;
    }
    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
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
    public String getPhoneNum(){
        return  phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

}
