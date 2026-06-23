class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int dig=0;
        int rev=0;
        while(x>0){
            dig = x%10;
            rev = rev*10+dig;
            x/=10;
        }
        if(rev==num){
            return true;
        }else{
            return false;
        }
    }
}