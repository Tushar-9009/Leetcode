class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1; 

        int first =-1;
        int last=-1;

        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                first=mid;
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        i=0;
        j=nums.length-1;
        if(first==-1){
            return arr;
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                last=mid;
                i=mid+1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}