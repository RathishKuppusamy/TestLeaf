package week3.day1.assignment;

//Multilevel inheritance
public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name is: Ratis");
	}
	
	public void studentDept() {
		System.out.println("Student Dept is: IT Dept");
	}
	
	public void studentId() {
		System.out.println("Student Id is: 12f290");
	}
		
	public static void main(String[] args) {
		
		Student studentObj = new Student();
		studentObj.collegeName();
		studentObj.collageCode();
		studentObj.collageRank();
		
		studentObj.deptName();
		
		studentObj.studentName();
		studentObj.studentDept();
		studentObj.studentId();
		
	}

}
