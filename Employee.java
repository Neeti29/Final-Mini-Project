package Entities;

public class Employee {

	private long empId;
	private String firstName;
	private String lastName;
	private String gender;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public Employee(long empId, String firstName, String lastName, String gender) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
