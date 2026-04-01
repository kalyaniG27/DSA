class sum{
    public static void main(String[] args) {   
       // Scanner sc= new Scanner(System.in);
        int[] arr ={1,2,3,4,5};
        int add=0;
        for (int i =0;i<= arr.length-1;i++){
            add += arr[i] ;
        }
        System.out.println("the sum is : " + add);
    }
}