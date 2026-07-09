class Solution {
    public String defangIPaddr(String address) {
        int n=address.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=address.charAt(i);
            if(ch=='.') res.append("[.]");
            else res.append(ch);
        }
        return res.toString();
    }
}