package BootCamp;

import java.util.Scanner;

public class Inopt {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a =sc.nextInt();
		System.out.println("Enter the value b : ");
		int b =sc.nextInt();
		System.out.println("Enter the value c : ");
		int c =sc.nextInt();
		
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);
	}

}
