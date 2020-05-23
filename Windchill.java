import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr the the valve t :");
		double t=sc.nextInt();
		System.out.println("Entr the the valve v :");
		double v=sc.nextInt();
		if(t>50||v>120||v<3){
			double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		} else   {
			System.out.println("temperature is too high");
		
			}
	
		}
	}


