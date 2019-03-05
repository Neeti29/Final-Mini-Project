package Project;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String emailid;
	private String pass;
	private String conf_pass;
	private String phone_number;
	private String address;
	private String skills;
	private String designation;
	private int salary;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName,String dob, String gender,String email_id,String pass,String conf_pass,String phone_number,String address,String skills,String designation,int salary ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob=dob;
		this.gender = gender;
		this.emailid=email_id;
		this.pass=pass;
		this.conf_pass=conf_pass;
		this.phone_number=phone_number;
		this.address=address;
		this.skills=skills;
		this.designation=designation;
		this.salary=salary;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
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

	public String getDOB() {
		return dob;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPass() {
		return pass;
	}

	public void setPass(String Pass) {
		this.pass = pass;
	}
	public String getConf_pass() {
		return conf_pass;
	}

	public void setConf_pass(String conf_pass) {
		this.conf_pass = conf_pass;
	}
	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}






}
