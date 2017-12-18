
public class Department {

	String deptName;
	String deptNum;
	String deptLead;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, String deptNum, String deptLead) {
		super();
		this.deptName = deptName;
		this.deptNum = deptNum;
		this.deptLead = deptLead;
	}

	@Override
	public int hashCode() {
		
		int result = 1;
		result+=this.deptName.hashCode()+this.deptNum.hashCode()+this.deptLead.hashCode();
		
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		Department d=(Department)obj;
		if((this.deptName.equals(d.deptName) && this.deptNum.equals(d.deptNum) && this.deptLead.equals(d.deptLead))){
			return true;
		}
		
		return false;
	
	}
	
	
	Employee employee;
	

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public String getDeptLead() {
		return deptLead;
	}

	public void setDeptLead(String deptLead) {
		this.deptLead = deptLead;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
