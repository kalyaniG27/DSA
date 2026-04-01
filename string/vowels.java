package string;

public class vowels {
    public static void main(String[] args) {
        boolean isEqual = false;
        String str1 = "hello";   
        String str2 = "sagar";
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(i)){
                isEqual = true;
            }
            else{
                isEqual = false;
            }
        }
        
        System.out.println(isEqual);

        
    }
    
}
