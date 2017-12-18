
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Department department = new Department("Developer", "S3466","Denis");
	    
	    
	    Employee emp = new Employee("Cooper","E67853", Gender.Male, "89 alan tr", "naresh@gmail.com");
	    
			department.employee=emp;
			
			System.out.println("employee name:"+department.employee.getEmpName());
			System.out.println("employee id:"+department.employee.getEmpId());
			System.out.println("Gender:"+department.employee.getGender());
			System.out.println("email:"+department.employee.getEmail());
			System.out.println("Address:"+department.employee.getAddress());
			System.out.println("-------------------------------------");
			System.out.println("Department name:"+department.deptName);
			System.out.println("Department Number:"+department.deptNum);
			System.out.println("Department Lead:"+department.deptLead);
	    
			
			
		}

	}


