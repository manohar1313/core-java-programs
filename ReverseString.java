package BootCamp;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the names : ");
		String inputstring=scan.nextLine();
		String[] words= inputstring.split(" ");
		String outputstring="";
		for(int i=words.length-1;i>=0;i--){
		outputstring =outputstring +words[i]+" ";
		}
		System.out.println("Hi, "+" " + outputstring);
		
		
	}

	}

