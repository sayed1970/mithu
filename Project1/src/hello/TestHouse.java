package hello;

public class TestHouse {

	public static void main(String[] args) {
		House house = new House();
		house.setHouseName("greenHouse");
		System.out.println(house.houseName);
		house.watchTV();
		house.bedRoom();
		house.displayHouseName();
		String name = house.getHouseName();
		System.out.println(name);
		house.Hello();
	}
}
