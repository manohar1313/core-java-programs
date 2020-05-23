package Home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rolldie {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random rd=new Random();
	System.out.println("Enter number of times to Roll dice : ");
	int n = sc.nextInt();
	int[] x=new int[6];
	
	int value;
	int chance=0;
	while(chance<n) {
		value=1+rd.nextInt(6);
		System.out.println(value);
		switch(value) {
		case 1:
			++x[0];
			break;
		case 2:
			++x[1];
			break;
		case 3:
			++x[2];
			break;
		case 4:
			++x[3];
			break;
		case 5:
			++x[4];
			break;
		case 6:
			++x[5];
			break;
		}
		chance++;
		
	}
	int max;
	for(int i=1;i<=6;i++)
		System.out.println("Number"+" "+ i +" "+"rolls"+" "+ x[i-1]+" "+"times");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//for (int j = 0; j < n; j+) {
		  //int x =(int) (1+Math.random()*6);
		//System.out.println(x);
		//for(int i=0;i<x.length;i++){
			//x[i]=(int)(1+Math.random()*6);
		//System.out.println(x[i]);
	
	
	
		 
        
		
		

}
	
	
	
	
