class Solution27 {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        int count = 0;
        for (int c = 0; c < nums.length; c++) {
            if (nums[c] == val) {
                count++;
                nums[c] = -1;
            } else {
                nums[n] = nums[c];
                n++;
            }
        }
        return nums.length - count;
    }
}