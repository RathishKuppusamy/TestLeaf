package week3.day2.assignment;

public class ArrayOddUpperCase {

	public static void main(String[] args) {
		
		String test = "changename";
		char[] c = test.toCharArray();
		System.out.println(c);
		
		for(int i=0;i<c.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(" " +Character.toUpperCase(c[i]));			
			}
		}

	}

}
