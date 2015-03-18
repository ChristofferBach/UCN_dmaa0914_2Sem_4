package BusinessLayer;

public class Supplier extends Person {
	private String country;

	public Supplier(String fname, String lname, String address, String zip,
			String phone) {
		super(fname, lname, address, zip, phone);
		// TODO Auto-generated constructor stub
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
