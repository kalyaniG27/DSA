
public class isEqual {

    public static void main(String[] args) {
        boolean isEqual = false;
        String str1 = "sagar";
        String str2 = "sagar";
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) == str2.charAt(i)) {
                    isEqual = true;
                } else {
                    isEqual = false;
                }
            }
        }

        System.out.println(isEqual);

    }

}
