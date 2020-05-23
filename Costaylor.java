package Bootcamp;

public class Costaylor {
	static void calccos(float n) {
		float accuracy=(float)0.0001, denominator,sinx,cosx,sinval,cosval;
		n=n*(float)(3.142/180.0);
		float x1=1;
		
		cosx=x1;
		cosval=(float)Math.cos(n);
		int i=1;
		do {
			denominator=2*i*(2*i-1);
			x1=-x1*n*n/denominator;
			cosx=cosx+x1;
			i=i+1;
	
		
		} while(accuracy<=cosval-cosx);
		System.out.println(cosx);
		
}
	public static void main(String[] args) {
float n=30;
calccos(n);

}
}

