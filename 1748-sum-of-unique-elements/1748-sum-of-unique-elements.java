class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int store = 0;
        int sum=0;
        if(n==1) return nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                store = nums[i];
            }else if(nums[i]!=nums[i+1] && nums[i]!=store){
                sum+=nums[i];
            }
        }
        if(n>=2){
            if(nums[n-1]!=nums[n-2]) sum+=nums[n-1];
        }
        return sum;
    }
}