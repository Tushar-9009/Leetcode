class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sarr = new int[26];
        int[] tarr = new int[26];
        int n=s.length();
        if(s.length()!=t.length())return false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            sarr[ch-'a']++;
            tarr[ch1-'a']++;
        }
        for(int i=0;i<26;i++){
            if(sarr[i]!=tarr[i]) return false;
        }
        return true;

    }
}