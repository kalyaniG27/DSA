//Find biggest odd number and return its index
class bigOdd {
    public static int find(int a[]){
        int i=0;
        int temp = a[i];
        int j = 0;
        
        for(i =0 ; i < a.length ; i++)
        {
            if(a[i]%2!=0 && a[i]>=temp){
                temp = a[i];
                j=i;
            }
        }return j;
    }
    public static void main(String[] args) {
        int[] a = {1,15,6, 3, 5, 7,9, 13};
        System.out.println(find(a) );

    }
}