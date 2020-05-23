package Home;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double c= sc.nextDouble();
		double t=c;
		double epsilon=1.0e-15;
		while(Math.abs(t-c/t)>epsilon*t){
			t=(c/t+t)/2;
		}
		System.out.println(t);

	}

}
