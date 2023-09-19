package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

//SET
public class SetRemoveDuplicate {

	public static void main(String[] args) {
		
		String s = "GOOGLE";
		char[] c = s.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<c.length; i++)
		{
		set.add(c[i]);
		}
		
	System.out.println(set);
	
	//to convert SET to String
	String output = "";
	
	for(Character each:set)
	{
		output=output+each;
	}
	System.out.println(output);
	}

}
