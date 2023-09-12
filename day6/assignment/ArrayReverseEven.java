package week3.day2.assignment;

public class ArrayReverseEven {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] s = test.split(" ");
						
		for(int i=0; i<s.length; i++)
		{
			if(i%2!=0)
			{
				char[] ch = s[i].toCharArray();
				for(int j=ch.length-1; j>=0; j--)
				{
					System.out.print(ch[j]);
				}
			}
			else
			{
				System.out.print(" " + s[i]  +" ");
			}
		}	
	}
}