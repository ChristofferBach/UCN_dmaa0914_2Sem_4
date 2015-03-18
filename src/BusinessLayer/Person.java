package BusinessLayer;

public class Person {
	 //instance variables 
    private String fname;
    private String lname;
    private String address;
    private String zip;
    private String phone;
    private int ID;
    
    public Person() {
        
    }
    public Person(int ID){
        this.ID = ID;
    }
    public Person (String fname, String lname, String address, String zip, String phone)
    {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
    }
    //set methods
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getAddress() {
		return address;
	}
	public String getZip() {
		return zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}