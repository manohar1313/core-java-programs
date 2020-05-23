package Home;

import java.util.Scanner;

public class Carloan {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount :");
		double p=sc.nextDouble();
		System.out.println("Enter the years :");
		double y=sc.nextDouble();
		System.out.println("Enter the rate :");
		double r=sc.nextDouble();
		double R=r/100*12;
		double N= 12*y;
		double payment=(p*R)/1-Math.pow(1+R, -N);
		System.out.println(payment);
		
	}

}
