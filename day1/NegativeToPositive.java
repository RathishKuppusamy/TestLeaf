package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		
		int neg = -40;
		if (neg < 0) {
			System.out.println("The given number is Negative.");
			neg = neg * -1;
			System.out.println("The number is converted to Positive number: " + neg);
		}
		else {
			System.out.println("The given number is not Negative, please enter a Negative number.");
		}
	}

}
