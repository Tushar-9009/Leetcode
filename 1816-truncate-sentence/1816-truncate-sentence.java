class Solution {
    public String truncateSentence(String s, int k) {
        int i=0;
        int n=s.length();
        StringBuilder res = new StringBuilder();
        while(k>0 && i<n){
            char ch=s.charAt(i);
            if(ch==' '){
                k--;
                if(k==0) break;
                res.append(ch);
                i++;
            }else{
                res.append(ch);
                i++;
            }
        }
        return res.toString();
    }
}