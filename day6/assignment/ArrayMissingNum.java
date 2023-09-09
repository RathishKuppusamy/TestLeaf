package week3.day2.assignment;

public class ArrayMissingNum {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6,7,8,9};
		int len = arr.length;
		
		for(int i=0;1<len;i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
