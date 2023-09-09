package week3.day1.assignment;

//Abstract
public class Automation extends MultipleLanguage {

	@Override
	public void selenium() {
		System.out.println("Selenium");		
	}

	@Override
	public void java() {
		System.out.println("Java");		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");	
	}
	
public static void main(String[] args) {
	
	Automation auto = new Automation();
	auto.java();
	auto.selenium();
	auto.python();
	auto.ruby();
	
	}
}
