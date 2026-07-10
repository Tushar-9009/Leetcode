class Solution {
    public String truncateSentence(String s, int k) {
        int i=0;
        int n=s.length();
        int count =k;
        StringBuilder res = new StringBuilder();
        while(count>0 && i<n){
            char ch=s.charAt(i);
            if(ch==' '){
                count--;
                if(count==0) break;
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