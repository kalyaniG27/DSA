class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        //int res=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();


            }else{
                st.push(ch);

            }
        }
        StringBuilder res = new StringBuilder();

for (char ch : st) {
    res.append(ch);
}

return res.toString();
    }
}