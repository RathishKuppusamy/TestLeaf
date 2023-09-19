package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class SetMissingNumber {

	public static void main(String[] args) {
		
		int[] data = {1,4,2,9,3,6,5,7,4,3};
		
		Set<Integer> set = new TreeSet<>();
		
		for(Integer each:data)
		{
			set.add(each);
		}
		System.out.println(set);
		
		Integer[] arr = new Integer[set.size()];
		set.toArray(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}	

	}

}
