package Home;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value x :");
		int x = sc.nextInt();
		System.out.println("Enter the value y :");
		int y = sc.nextInt();
	double distance = Math.sqrt(x*x+y*y);
	System.out.println(distance);
	}

}
