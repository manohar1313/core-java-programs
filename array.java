package Home;

public class array {
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int i=0;
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " "); 
            i+=1;
        }  
    }  

}
