package week3.day2;

import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] scores = {98,97,76,87,90};
	      
		for (int i = scores.length-1; i >= 0 ; i--) {
			
			System.out.println(scores[i]);
			
		}
	}

}
