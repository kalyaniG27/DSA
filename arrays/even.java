//find number of even elements

class even {
    
    public static int find(int a[]){
        int count =0;
        for(int i =0 ; i < a.length ; i++)
        {
            if(  a[i] % 2 == 0){
                count++;
                
            }
        }return count;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(find(a) );

    }
}