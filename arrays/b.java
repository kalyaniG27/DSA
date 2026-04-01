// wap for user entered ele and array element comaparizon and it is same then print that number itself and their respective index 

import java.util.Scanner;
public class b{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        for (int i=0;i<=4;i++){
            if(arr[i]==n){
                System.out.println( "Element " + n + " At array index " + i );
            }
                
           
        } 
            
        
        
    }  
    
}
        
        
        