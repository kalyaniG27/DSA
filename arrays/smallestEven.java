//Find smallest even number and return index
class smallestEven {
    
    public static int find(int a[]){
        int i=0;
        //int j=0;
        int temp = a[i];
        int j = 0;
        
        for(i =0 ; i < a.length ; i++)
        {
            if(a[i]%2==0 && a[i]<=temp){
                temp = a[i];
                j=i; 
            }
        }return j;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(find(a) );

    }
}