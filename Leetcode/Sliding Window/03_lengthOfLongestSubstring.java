class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int high=0;
        int low=0;
        int res=0;
        for(high=0;high<n;high++){
            map.put(
                s.charAt(high),
                map.getOrDefault(s.charAt(high),0)+1
            );
            
            while(map.size()<high-low+1){
                char ch=s.charAt(low);
                map.put(ch,map.get(ch)-1);

                if(map.get(ch)==0){
                    map.remove(ch);
                }low++;
                
            }
            if(map.size()==high-low+1){
                int len =high-low+1;
                res=Math.max(res,len);
            }

        } return res;

    }
}