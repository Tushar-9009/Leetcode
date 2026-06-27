class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        int sum=0;
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(res<sum) res=sum;
            if(sum<0) sum=0;
        }
        return res;
    }
}