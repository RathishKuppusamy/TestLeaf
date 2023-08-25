package week1.day2;

public class Calculator {

	Calculator c = new Calculator();

	private int addTwoNumbers(int add1,int add2)
		{
		return	add1+add2;
		}
	public float mulTwoNumbers(float mul1,int mul2)
	{
		return mul1+mul2;
	}
	public void subTwoNumbers()
	{
		int sub1 = 40;
		int sub2 = 10;
		System.out.println("Subtraction result: " + (sub1-sub2));
	}
	
}
