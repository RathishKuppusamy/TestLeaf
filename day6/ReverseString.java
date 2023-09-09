package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String leaf = "Testleaf";
		
		char[] ch = leaf.toCharArray();
		
		
for (int i = ch.length-1; i >= 0 ; i--) {
			
			System.out.print(ch[i]);
			
		}
	}

}
