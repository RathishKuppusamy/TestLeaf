package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println("multiplication result: " + c.mulTwoNumbers(40.5f, 2));
		c.subTwoNumbers();
	//Private method
		//c.addTwoNumbers(2,4);
	}

}
