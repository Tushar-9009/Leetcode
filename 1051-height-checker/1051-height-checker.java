class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int exp[]=new int[n];
        for(int i=0;i<n;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=exp[i]){
                count++;
            }
        }
        return count;
    }
}