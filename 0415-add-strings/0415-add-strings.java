class Solution {
    public String addStrings(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int i=n-1,j=m-1;
        int carry = 0;
        StringBuilder res=new StringBuilder();
        while(i>=0 || j>=0 || carry >0){
            int x=0;
            if(i>=0){
                x =num1.charAt(i)-'0';
            }
            int y=0;
            if(j>=0){
                y = num2.charAt(j)-'0';
            }
            int sum = x+y+carry;
            res.append(sum%10);
            carry = sum/10;

            i--;
            j--;
        }
        return res.reverse().toString();
    }
}