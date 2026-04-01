import java.util.Scanner;
class Conversion { 
    public static void main(String[]arg)
    {
        int hrs =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes ");
        int min = sc.nextInt();
        hrs=min/60 ;
        int reminder = min%60;
        System.out.println("Total hrs :" + hrs  + " and remaining minutes: " +reminder);
    }
    
}
