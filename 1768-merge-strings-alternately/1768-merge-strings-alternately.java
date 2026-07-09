class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder res = new StringBuilder();
        int i=0;
        int j=0;
        while(i<n && j<m){
            char ch=word1.charAt(i);
            res.append(ch);
            i++;
            char wo=word2.charAt(j);
            res.append(wo);
            j++;
        }
        if(i==n){
            while(j<m){
                char wo=word2.charAt(j);
                res.append(wo);
                j++;
            }
        }
        if(j==m){
            while(i<n){
                char ch=word1.charAt(i);
                res.append(ch);
                i++;
            }
        }
        return res.toString();
    }
}
