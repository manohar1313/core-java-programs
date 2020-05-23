import java.util.Random;

public class Random5 {
	public static void main(String[] args){
		double[] n=new double[5];
		double sum=0.0;
		double min=Double.MAX_VALUE;
		double max=Double.MIN_VALUE;
		
		System.out.println("Enter random numbers : ");
		for(int i=0;i<n.length;i++){
			n[i]=Math.random()*(1+0);
			System.out.println(n[i]);
		}
		for(int i=0;i<n.length;i++){
			if(n[i]<min)
				min=n[i];
			if(n[i]>max)
				max=n[i];
		}
		for(int i=0;i<n.length;i++)
			sum=sum+n[i];
		double avg=sum/n.length;
		System.out.println("Minimum value : " + min);
		System.out.println("Maximum value : " + max);
		System.out.println("Average value : " + avg );
	
	}

}
