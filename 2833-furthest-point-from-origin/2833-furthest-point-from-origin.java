class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int r=0,l=0,u=0;
        for(int i=0;i<n;i++){
            char ch= moves.charAt(i);
            if(ch=='R') r++;
            else if(ch=='L') l++;
            else u++;
        }
        int res=Math.abs(r-l)+u;
        return res;
    }
}