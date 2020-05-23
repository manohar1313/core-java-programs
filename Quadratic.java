package Home;

import java.util.Scanner;

public class Quadratic {
public static void main(String[] args){
	double root1,root2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value a :");
	double a =sc.nextDouble();
	System.out.println("Enter the value b :");
	double b =sc.nextDouble();
	System.out.println("Enter the value c :");
	double c =sc.nextDouble();
	double delta=b*b-4*a*c;
	double sqrt=Math.sqrt(delta);
	 root1=(-b+sqrt)/(2*a);
   	root2=(-b-sqrt)/(2*a);
System.out.println(root1);
System.out.println(root2);
}
}
