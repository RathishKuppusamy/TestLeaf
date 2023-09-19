package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSecondLargestNumber {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0; i<data.length; i++)
		{
			set.add(data[i]);
		}
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		System.out.println(list.get(list.size()-2));
	}

}
