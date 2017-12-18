
public class TestHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	Department deprtment = new Department("Developer", "S3466","Denis");
	
	Department d2 = new Department("Developer", "S3466","Denis");
	
    System.out.println("detail2:"+deprtment.hashCode());
	
	System.out.println("detail2:"+d2.hashCode());
		
	}

}
