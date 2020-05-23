package BootCamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {
	static ArrayList<String> arrlist = new ArrayList<String>();
	private static void permutations(String s1, String s2)
	//public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		
	
	{
		if (s2.length() == 0) {
			System.out.println(s1);
		}

		for (int i = 0; i < s2.length(); i++)
		{
			String s3 = s1 + s2.charAt(i);

			String s4 = s2.substring(0, i) +
								 s2.substring(i + 1);

			permutations(s3, s4);
		}
	}

	
	public static void main(String[] args)
	{
		String s = "ABC";
		permutations("", s);
	}

}
