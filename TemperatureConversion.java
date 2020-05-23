import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the valve F :");
		double F=sc.nextInt();
		System.out.println("Enter the the valve C :");
		double C=sc.nextInt();
		
		double Celsius=(F-32)*5/9;
		System.out.println(Celsius);
		double Fahrenheat=(C*9/5)*32;
		System.out.println(Fahrenheat);
	}

}
