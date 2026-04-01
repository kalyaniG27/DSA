class recursion {
    static int x = 1;
    static void fun()
    {
        if( x == 5 )
        {
            return;
        }
        System.out.println(x);
        x++;
        fun();
    }
    public static void main (String arg [])
    { 

      fun();

    }
}