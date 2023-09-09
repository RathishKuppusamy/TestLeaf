package week3.day2.assignment;

//Override
public class AxisBank extends BankInfo {
	
	
	  public void deposit() { 
		  System.out.println("FD, RD and Equity"); 
		  }
	 

	public static void main(String[] args) {


		AxisBank axisbank = new AxisBank();
		axisbank.saving();
		axisbank.fixed();
		axisbank.deposit();
		
	}
}
