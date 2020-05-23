package Bootcamp;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		int s1, s2, count=0,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the min number : ");
		s1=sc.nextInt();
		System.out.println("Enter the max number : ");
		s2=sc.nextInt();
		for(i=s1;i<=s2;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					count=0;
					break;
				}
				else{
					count=1;
				}
			}
			if(count==1){
				System.out.println(i);
			}
			
		}

	}

}
