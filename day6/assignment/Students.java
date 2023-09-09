package week3.day2.assignment;

//Overload
public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(id +" " +name);
	}
	
	public void getStudentInfo(String email, long phone) {
		System.out.println(email +" " +phone);
	}
	
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(243);
		s.getStudentInfo(243, "Ratis");
		s.getStudentInfo("sampleemail00@email", 7896541230l);
		
	}

}
