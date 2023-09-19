package week4.day1;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		
		String s = "babu";
		char[] c = s.toCharArray();
		
		Set<Character> ss = new HashSet<>();
		for(char each:c)
		{
			if (!ss.contains(each)) {
                ss.add(each);
            } else {
                // If the character is already in the HashSet, remove it (to keep it unique)
                ss.remove(each);
            }
        }

        // Print the unique characters
        for (char uniqueChar : ss) {
            System.out.print(uniqueChar + " ");
        }
    }
}
