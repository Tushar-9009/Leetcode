class Solution {
    public boolean checkIfPangram(String sentence) {
        int s=sentence.length();
        int[] freq=new int[26];
        for(int i=0;i<s;i++){
                char ch=sentence.charAt(i);
                int idx=ch-'a';
                freq[idx]++;
        }
        for(int i=0;i<26;i++){
                if(freq[i]==0) return false;
        }
        return true;
    }
}