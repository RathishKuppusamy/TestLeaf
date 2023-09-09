package week3.day2.assignment;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		int c = a.length;
		int d = b.length;
		
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<d; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
