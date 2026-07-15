class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='U') x++;
            if(ch=='D') x--;
            if(ch=='R') y++;
            if(ch=='L') y--;
        }
        if(x==0 && y==0) return true;
        return false;
    }
}