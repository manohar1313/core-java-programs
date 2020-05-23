package BootCamp;

public class Pattern {
	public static void main(String[] args){
	int i,j,k,count=4;
	/*	for(i = 0;i<9;i++){
			for( j=0;j<2;j++){
				System.out.printf("*");
			}
		
			for(k=0;k<=4;k++){
					if(k==count)
						System.out.printf("***");
					else
						System.out.printf(" ");				
			}
	
			if(i<=3){
				count--;
			}else if(i<9){
				count++;
			
		}
		System.out.println("\n");
		}*/
	

	/*for(i = 0;i<=11;i++){
			for(j=0;j<2;j++){
				System.out.printf("*");
			}
		
			for(k=1;k<=5;k++){
				if(i>=0&&i<2||i>9&&i<=11||k==5){
					System.out.printf("**");
				}else{
					System.out.printf("  ");
				}
				}
			for(j=0;j<=1;j++){
				if(i>=0&&i<2||i>9&&i<=11){
					System.out.printf("  ");
				}else{
					
				}
			}
			System.out.println("");
			
			}
		/*System.out.println();*/
		
		/*for(i=0;i<9;i++){
			for(j=0;j<=2;j++){
				System.out.print("*");
			}
		
			for(k=10;k>=i;k--){
				System.out.print(" ");
			}
			for(j=0;j<=2;j++){
			System.out.print("*");	
			}
			for(int l=1;l<=i;l++){
				System.out.print("  ");
			}
			for(j=0;j<=2;j++){
				System.out.print("*");
			}
			for(k=10;k>=i;k--){
				System.out.print(" ");
			}
			for(j=0;j<=2;j++){
				System.out.print("*");
			}
			System.out.println("\n");
			}*/
//--------programs--------//	
    for (i = 0; i < 9; i++){ 
         
        for (j = 0; j <=9; j++){ 
             
            if (j == 1 || ((i == 0 || 
                         i == 8) && 
               (j > 1 && j < 7)) || 
               (j == 7 && i != 0 &&  
                           i != 8)) 
                System.out.print("**");  
            else
                System.out.print("  ");  
        } 
          
    System.out.println(); 
	}
	
	
	for (i = 0; i < 9; i++){ 
        
        for (j = 0; j <=5; j++){ 
             
            if (j == 0 || (5-j) == i||(3+j)==i){
                         
                System.out.print(" **");  
        }
        else {
          	System.out.print("  ");  
        } 
        } 
    System.out.println();
	}
	
	
for (i = 0; i < 9; i++){ 
        
        for (j = 0; j <9; j++){ 
             
            if (j == 0 || j == 8||(i==j||i+j==8)&&i>3){
                         
                System.out.print("** ");  
        }
        else {
          	System.out.print("   ");  
        } 
        } 
    System.out.println();
	}
	
	
	
}
}

