import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the degrees : ");
		double degrees=sc.nextInt();
		double radians=Math.toRadians(degrees);
double s=Math.sin(radians);
System.out.println("sin("+degrees+")="+s);
double c=Math.cos(radians);
System.out.println("cos("+degrees+")="+c);
double t =Math.tan(radians);
System.out.println("tan("+degrees+")="+t);
System.out.println(s+"/"+c+"="+s/c);

double r=s*s+c*c;
System.out.println(r);
	}

}
