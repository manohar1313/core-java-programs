package BootCamp;

import java.util.Scanner;

public class Doubleopt {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a : ");
		double a =sc.nextInt();
		System.out.println("Enter the value b : ");
		double b =sc.nextInt();
		System.out.println("Enter the value c : ");
		double c =sc.nextInt();
		
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);
	}


}
