class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=command.charAt(i);
            if(ch=='(' && command.charAt(i+1)==')'){
                res.append("o");
                i++;
            }else if(ch=='(' && command.charAt(i+1)=='a'){
                res.append("al");
                i+=3;
            }else res.append(ch);
        }
        return res.toString();
    }
}