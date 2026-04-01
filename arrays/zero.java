//find first 0 element and return its index
class zero {
    
    public static int find(int a[]){        
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] == 0 ){
                return i;
            } 
        }
        return -1;
    }//return -1;
    public static void main(String[] args) {
        int[] a = {1,2,0,3,4,7,0,8,9};
        System.out.println(find(a) );

    }
}