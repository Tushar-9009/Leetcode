class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count_z = 0;
        int count_o = 0;
        int count_t = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                count_z++;
            else if (nums[i] == 1)
                count_o++;
            else
                count_t++;
        }
        for (int i = 0; i < n; i++) {
            if (i < count_z)
                nums[i] = 0;
            else if (i < count_o + count_z)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}