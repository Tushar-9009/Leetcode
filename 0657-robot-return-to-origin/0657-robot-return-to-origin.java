class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int uc=0,dc=0,rc=0,lc=0;
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='U') uc++;
            if(ch=='D') dc++;
            if(ch=='R') rc++;
            if(ch=='L') lc++;
        }
        if(uc!=dc || rc!=lc) return false;
        return true;
    }
}