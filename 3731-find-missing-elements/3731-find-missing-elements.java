class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n=nums.length;
        int min=101;
        int max=0;
        int[] arr = new int[101];
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            arr[nums[i]]++;
        }
        for(int i=min;i<=max;i++){
            if(arr[i]==0) res.add(i);
        }
        return res;
    }
}