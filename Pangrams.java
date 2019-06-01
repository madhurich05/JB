/*
You are given a string consisting of letters and the cost of adding a specific character to it. You need to convert the string into a pangram, i.e. it contains all the lower case alphabets (a-z) in it. The cost of above operation is to be minimised.

Ex: 
3
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
abcdefghijklmopqrstuvwz
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
thequickbrownfoxjumpsoverthelazydog
24 25 26 1 2 3 16 17 18 19 20 21 22 23 4 5 6 7 8 9 10 11 12 13 14 15
thisisnotonlyastringtotestourabilitytothinkandprogrambutalsototestourcapabilitytopredictthetestcases
*/



import java.util.*;

public class Pangrams {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int c1 = 97;
			HashMap<Character, Integer> hm = new HashMap<>();
			for (int j = 1; j <= 26; j++) {
				hm.put((char) c1, sc.nextInt());
				c1++;
			}
			String inputstr = sc.next();
			for (Character c : inputstr.toCharArray()) {
				if (hm.containsKey(c)) { // character present
					hm.put(c, 0);
				}
			}
			int totalCost = 0;
			for (int val : hm.values()) {
				totalCost += val;
			}
			System.out.println(totalCost);
		}
	}
}
