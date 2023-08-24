package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 4523657894153654L;
	boolean isPunctured = false;
	String bikeName = "TVS Apache";
	double runningKM = 45.2;
	
	public static void main(String[] args) {
		
		TwoWheeler Bike = new TwoWheeler();
		
		System.out.println("Number of wheels: " + Bike.noOfWheels);
		System.out.println("Number of Mirrors: " + Bike.noOfMirrors);
		System.out.println("Chasis Number is: " + Bike.chassisNumber);
		System.out.println("Bike is punctured? " + Bike.isPunctured);
		System.out.println("Bike name is: " + Bike.bikeName);
		System.out.println("Mileage of Bike is: " + Bike.runningKM);
					
	}
}
