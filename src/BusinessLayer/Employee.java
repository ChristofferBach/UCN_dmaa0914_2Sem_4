package BusinessLayer;

public class Employee extends Person {
private double salary;

	public Employee(String fname, String lname, String address, String zip,
			String phone, double salary) {
		super(fname, lname, address, zip, phone);
		// TODO Auto-generated constructor stub
		this.salary = salary;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
