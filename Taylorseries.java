package Bootcamp;

import java.util.Scanner;

public class Taylorseries {
	//public static void main(String[] args) {
	static void calcsin(float n) {
		float accuracy=(float)0.0001, denominator,sinx,cosx,sinval,cosval;
		n=n*(float)(3.142/180.0);
		float x1=n;
		sinx=n;
		sinval=(float)Math.sin(n);
		int i=1;
		do {
			denominator=2*i*(2*i+1);
			x1=-x1*n*n/denominator;
			sinx=sinx+x1;
			i=i+1;
	
		
		} while(accuracy<=sinval-sinx);
		System.out.println(sinx);
		
}
	public static void main(String[] args) {
float n=90;
calcsin(n);
		/*Scanner sc= new Scanner(System.in);
		double x=sc.nextInt();
        x = x % (2 * Math.PI);
        double term = 1.0; 
        double sum=0.0;
        
        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            
            if (i % 4 == 1) 
            	sum += term;

            if (i % 4 == 3) 
            	sum -= term;

        }
            System.out.println(sum);

		
	}*/
}
	}
	