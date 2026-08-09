class Solution {
    public String removeStars(String s) {
        StringBuilder a = new StringBuilder();


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                 a.deleteCharAt(a.length() - 1);
            }else{
                a.append(s.charAt(i));           
            }
        } return a.toString();
    }
}