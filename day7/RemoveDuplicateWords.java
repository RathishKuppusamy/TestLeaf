package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArr = text.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(int i=0; i<textArr.length; i++)
		{
			set.add(textArr[i]);
		}
		System.out.println(set);
		
		List<String> list = new ArrayList<>(set);
		String output = "";
		//System.out.println(list.get(0));
		System.out.println("With Duplicates: " + "\n" +text);
		System.out.println("Without Duplicates: ");
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
