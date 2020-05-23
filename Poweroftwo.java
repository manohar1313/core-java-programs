import java.util.Scanner;

public class Poweroftwo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the power value : ");
int n =sc.nextInt();
int i=0;
int powerOfTwo = 1;       

while (i <= n) {
    System.out.println(powerOfTwo);   
    powerOfTwo = 2 * powerOfTwo; 
    i=i+1;
 
}
	
	}

}
