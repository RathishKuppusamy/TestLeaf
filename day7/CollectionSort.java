package week4.day1;

import java.util.Arrays;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		
		String[] Comp = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int n = Comp.length;
		Arrays.sort(Comp);
		//System.out.println(Comp[0]);
		
		for(int i=n-1; i>=0; i--)
		{
			System.out.print(Comp[i] +" ");
		}

	}

}
