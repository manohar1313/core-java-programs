package Bootcamp;

import java.util.Scanner;

public class powerof2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a =sc.nextInt();
System.out.println(powerof2(a));		

}
	private static boolean powerof2(int num) {
	if(num<=0) {
	return false;
	}
	while(num>1) {
	if(num%2!=0) {
	return false;
	
	}
	num=num/2;
	}
	return true;
	}
}
