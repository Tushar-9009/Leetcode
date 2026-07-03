class Solution {
    public boolean canAliceWin(int[] nums) {
        int singsum=0;
        int doubsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                singsum+=nums[i];
            }else{
                doubsum+=nums[i];
            }
        }
        return singsum!=doubsum;
    }
}