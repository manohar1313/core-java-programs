package BootCamp;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Stringequals {
	public static ArrayList<String> iterativePermutation(String s1) {
		ArrayList<String> li = new ArrayList<String>();
		li.add(String.valueOf(s1.charAt(0)));

		for (int i = 1; i < s1.length(); i++) {
			for (int j = li.size() - 1; j >= 0; j--) {
				String s2 = li.remove(j);
				for (int k = 0; k <= s2.length(); k++) {
					li.add(s2.substring(0, k) + s1.charAt(i) + s2.substring(k));
				}
			}
		}
		return li;
	}
	
	static ArrayList<String> arrlist = new ArrayList<String>();

	public static void recursivePermutation(String s1, String s2) {
		if (s1.length() == 0) {
			System.out.print(s2 + " ");
			arrlist.add(s2);
		}
		for (int i = 0; i < s1.length(); i++) {

			String s3 = s2 + s1.charAt(i);

			String s4 = s1.substring(0, i) + s1.substring(i + 1);

			recursivePermutation(s4, s3);
		}

	}

	public static boolean check2PermutationArrays(String s1) {
		int count = 0;
		recursivePermutation(s1, "");
		String[] iterArr = new String[iterativePermutation(s1).size()];
		iterativePermutation(s1).toArray(iterArr);
		String[] strArr = new String[arrlist.size()];
		arrlist.toArray(strArr);
		Arrays.sort(strArr);
		Arrays.sort(iterArr);
		System.out.println();
		System.out.println("Iterative Permutation : " + Arrays.toString(iterArr));
		System.out.println("Recursive Permutation : " + Arrays.toString(strArr));
		

		if(Arrays.equals(iterArr,strArr))

			return true;

		else
			return false;
	}
public static void main(String[] args)
{
	String s1="abc";
	System.out.println(check2PermutationArrays(s1));
	System.out.println();
	System.out.println();
}
}


