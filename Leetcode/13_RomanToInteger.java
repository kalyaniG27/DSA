import java.util.HashMap;
class Solution {
    public int RomanToInt(String s) {
        HashMap<Character, Integer> Roman = new HashMap<Character, Integer>();
        Roman.put('I' , 1);
        Roman.put('V' , 5);
        Roman.put('X' , 10);
        Roman.put('L' , 50);
        Roman.put('C' , 100);
        Roman.put('D' , 500);
        Roman.put('M' , 1000);
        int total = 0;
        
        for (int i = 0; i< s.length(); i++){
            int current = Roman.get(s.charAt(i));

            if (i < s.length() - 1 && current < Roman.get(s.charAt(i + 1))) {
                total -= current; 
            } else {
                total += current;
            }

        } return total ;
    }
}