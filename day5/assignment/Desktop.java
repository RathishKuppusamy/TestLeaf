package week3.day1.assignment;

//Inheritance1
public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Screen size is: 52 inches");	
	}
	
	public static void main(String[] args) {
		
		Desktop desktopObj = new Desktop();
		desktopObj.computerModel();
		desktopObj.desktopSize();
		
	}

}
