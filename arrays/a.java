//take input from user for array and return me the maximum sum that can be obtained using 3 elements of that array Those elements can be any three of the array Sequence does not matter And repeatation is not allowed
import java.util.Scanner;
public class a{
    public static void main(String[] args) {
        //int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0; i<n;i++)
        {  
            System.out.println("Enter a element for index "  + i + " of an array");
            arr[i]= sc.nextInt();
        }System.out.print("array elements :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
        


    }

}