package oop;

public class TestStudent {
	
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStID(303);
		st1.setStName("Sayed Siddeque");
		st1.setStDob("11-07-1980");
		System.out.println(st1.getStID()+ " " +st1.getStName()+ " "+st1.getStDob());
		
		 
			Student st2 = new Student();
			st2.setStID(305);
			st2.setStName("Tahir Siddeque");
			st2.setStDob("12-07-1990");
			System.out.println(st2.getStID()+ " " +st2.getStName()+ " "+st2.getStDob());
	}

}
