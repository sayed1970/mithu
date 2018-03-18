package hello;

public class House {
	int address;
	String houseName;

	// Constructor1
	public House() {

	}

	// Constructor2

	public House(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);

	}

	// Constructor3
	public House(String houseName, int address) {
		this.houseName = houseName;
		this.address = address;
		System.out.println(houseName + " " + address);
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public void watchTV() {
		System.out.println("Lets watch Game Of Thrones");
	}

	public void bedRoom() {
		System.out.println("People will sleep in bed room");
	}

	public String getHouseName() {
		System.out.println("People will sleep");
		return houseName;

	}

	public void displayHouseName() {
		System.out.println("House Name is Trump House");

	}

	public void Hello() {
		System.out.println("Hello Tahir");
	}
}
