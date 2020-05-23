package Bootcamp;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args){
		int power=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value n : ");
		int n = sc.nextInt();
		while(power<=n/2){
			power=power*2;
		}
		while(power>0){
			if(n<power){
				System.out.print(0);
			}else{
				System.out.print(1);
				n=n-power;
			}
			power=power/2;
		}
		System.out.println();
	}

}
