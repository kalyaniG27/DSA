public class addEvenNum {
    public static void main(String[] args) {
        int add =0;
        int[] arr ={1,2,3,4,5};
        for (int i =0;i<arr.length-1;i++)
            {
              if(arr[i]%2==0)
                {
                    add += arr[i];
                }                   
            //add++;
            }
        //add = arr[i]+arr[i+1];
        System.out.println(" Addition of even num in array :" + add);
        


    }
    
}
