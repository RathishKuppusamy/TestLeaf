package week3.day2.assignment;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		
		String test = "Java language is java based on Java OOPs concept";
		String[] s = test.split(" ");
		int count = 0;
		for(int i = 0; i<s.length; i++)
		{
			for(int j = i+1; j<s.length; j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
						{
					s[j] = "";
					count++;
						}
			}
		}
		if(count>0)
		{
		for(int k=0; k<s.length; k++)
		{
			System.out.print(s[k] +" ");	
		}
		
	}
	}
}