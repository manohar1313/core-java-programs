import java.util.Scanner;

public class Sqrt {
	public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double EPSILON = 1E-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON*t)
            t = (c/t + t) / 2.0;
        return t;
    }

    
    public static double sqrt(double c, double epsilon) {
        if (c < 0) return Double.NaN;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t)
            t = (c/t + t) / 2.0;
        return t;
    }


    
    public static void main(String[] args) {        
    	Scanner sc=new Scanner(System.in);
    	int a =sc.nextInt();
    	
    	//double[] a = new double[args.length];
        //for (int i = 0; i < args.length; i++) {
         //   a[i] = Double.parseDouble(args[i]);
        //}

        
        //for (int i = 0; i < a; i++) {
            double x = sqrt(a);
            System.out.println(x);
        }
    }
	


