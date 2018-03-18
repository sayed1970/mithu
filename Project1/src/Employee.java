
public class Employee {

	private  String firstName;
	private  String lastName;
	private  int    age;
	
	
	public Employee(String empFirstName, String empLastName,int empage ) {
		
		firstName = empFirstName;
		lastName = empLastName;
		age = empage;
		
		
	}
	
	
		public void displayEmpDetails()
		{
			
		System.out.println("Name : " +firstName + " "+ lastName);
		System.out.println("Age :" + age);
	}
}
