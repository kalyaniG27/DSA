class Solution {
    public int strStr(String haystack, String needle) {
       if (haystack.indexOf(needle) != -1) {
         int index= haystack.indexOf(needle);
          return index;
        } else {
          return-1;
}//return 0;
}
}