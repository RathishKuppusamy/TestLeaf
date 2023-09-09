package week3.day2.assignment;

public class ArrayPalindrome {

	public static void main(String[] args) {
		
		String s = "MADAM";
		String revs = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			revs=revs+s.charAt(i);
		}
		System.out.println(revs);
		if(s.equals(revs))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
