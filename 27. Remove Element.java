class Solution {
    public int removeElement(int[] nums, int val) {
        int i = nums.length - 1;
        int j = 0, temp;
        int k = 0;
        while (j <= i) {
            if (nums[j] == val && nums[i] != val) {
                nums[j] = nums[i];
                j++;
                i--;
                k++;
            } else if (nums[i] == val) {
                i--;
            } else {
                j++;
                k++;
            }
        }
        return k;
    }
}