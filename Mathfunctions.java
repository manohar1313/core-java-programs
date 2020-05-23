import java.util.Scanner;

public class Mathfunctions {
	static double harmonic(int n) 
	{
	    double s = 0.0;
		for (int i=1;i<=n;i++) {
			s += 1.0/i;
		}
	    return s; 
	}

	static void sinCos(double angle){
		double radians = Math.toRadians(angle);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		System.out.println("Sin value is: "+" "+sin);
		System.out.println("Cos value is: "+""+cos);
	}

	static void binary(int n){
		int[] binary= new int[1000];
		int i=0;
		while (n>0) {
			binary[i]= n%2;
			n=n/2;
			i++;
		}
		for (int j=i-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
	}

    public static double sqrt(double c){
    	double epsilon = 1.0e-15;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    public static boolean isPrime(int n){
		int flag=1;
		if (n>=2) {
			for (int j=2;j<=n/2;j++) {
				if (n%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println("Enter a valid number");
		}
		return true;
	}

	static long factorial(int n){
		int num=1;
		for (int i=1;i<=n;i++) {
			num=i*num;
		}
		return num;
	}

	static double futureValue(double c,double r,int t){
		double fvalue=0;
		if (c!=0||r!=0||t!=0) {
			fvalue=c*Math.pow((1+r),t);
		}
		return fvalue;
	}

	static double presentValue(double c,double r,int t){
		double pValue=0;
		if (c!=0||r!=0||t!=0) {
			pValue=c/Math.pow((1+r),t);
		}
		return pValue;
	}

	static void intValue(int[] arr){
		int low=arr[0];
		int high=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (low>arr[i]) {
				low=arr[i];
			}
			if (high<arr[i]) {
				high=arr[i];
			}
		}
		System.out.println("The Highest value is: "+high);
		System.out.println("The Lowest value is: "+low);
	}

	static void stringValue(String[] arr){
		String low=arr[0];
		String high=arr[0];
		for (int i=1;i<arr.length;i++) {
			if (arr[i].length()<low.length()) {
				low=arr[i];
			}
			if (arr[i].length()>high.length()) {
				high=arr[i];
			}
		}
		System.out.println("The Highest string value is: "+high);
		System.out.println("The Lowest string value is: "+low);
	}

	static void usingSlope(int x1,int y1,int x2,int y2,int x3,int y3){
		int ab=(y2-y1)/(x2-x1);
		int bc=(y3-y2)/(x3-x2);
		int ac=(y3-y1)/(x3-x1);
		if (ab==bc)
			System.out.println("It's Colinear using Slope");
		else
			System.out.println("It's not Colinear using Slope");
	}
	static void usingArea(int x1,int y1,int x2,int y2,int x3,int y3){
		int a=x2-x1;
		int b=x3-x2;
		int c=y2-y1;
		int d=y3-y2;
		double colinear=0.5*((a*d)-(b*c));
		if (colinear==0)
			System.out.println("It's Colinear using Area");
		else
			System.out.println("It's not Colinear using Area");
	}

    public static void main(String[] args) {
    	
  		Scanner sc= new Scanner(System.in);
		// System.out.println("Enter a number: ");
    	int n=7;
    	System.out.println("Harmonic Number is: "+harmonic(n));
    	double angle= 60.0;
    	sinCos(angle);
		int num=14;
		System.out.println("Binary number of "+num);
		binary(num);
		System.out.println();
		//System.out.println("Enter a number for Square root: ");
        double c = 9;
        System.out.println("Square root is: "+sqrt(c));
        //System.out.println("Enter a number for check prime number: ");
		int val=13;
		System.out.println("It's Prime Number: "+isPrime(val));
		//System.out.println("Enter a number for factorial: ");
		int fact=5;
		System.out.println("Factorial is: "+factorial(fact));
		System.out.println("Enter the principal: ");
		double m=sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		double r=sc.nextDouble()/100;
		System.out.println("Enter the time: ");
		int t=sc.nextInt()*12;
        System.out.println("The Future Value is: "+ futureValue(m,r,t));
        System.out.println("The Present Value is: "+ presentValue(m,r,t));
        int[] arr={58,57,92,53,5,63,26,74};
        intValue(arr);
        String[] arr1={"one","two","three","four","five"};
        stringValue(arr1);
        int a1 = 2, a2 = 4, a3 = 6, b1 = 4, b2 = 6, b3 = 8;  
		usingSlope(a1, b1, a2, b2, a3, b3);
		usingArea(a1, b1, a2, b2, a3, b3);
    }
}
