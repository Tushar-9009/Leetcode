class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                ch=(char)(ch+32);
                res.append(ch);
            }
            else if(ch>=97 && ch<=122)
            res.append(ch);
            else if(ch>='0' && ch<='9') 
            res.append(ch);
        }
        int m=res.length();
        for(int i=0;i<m/2;i++){
            if(res.charAt(i)!=res.charAt(m-1-i)) return false;
        }
        return true;
    }
}