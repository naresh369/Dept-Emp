
public class Employee {

	private String empName;
	private String empId;
	private Gender gender;
	private String address;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empId, Gender gender, String address, String email) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.gender = gender;
		this.address = address;
		this.email = email;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
