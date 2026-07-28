class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=arr[0];
        int res=arr[0];
        
        for(int i=1;i<arr.length;i++){
            int prevnodelete=nodelete;
            int prevonedelete=onedelete;
            
            nodelete=Math.max(nodelete+arr[i],arr[i]);
            onedelete=Math.max(prevonedelete+arr[i],prevnodelete);
            res=Math.max(res,Math.max(nodelete,onedelete));
        }return res;
    }
}