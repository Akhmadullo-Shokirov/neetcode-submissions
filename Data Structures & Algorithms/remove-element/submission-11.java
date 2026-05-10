class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;
        while(left <= right) {
            if(nums[left] == val) {
                while(right > left && nums[right] == val) {
                    right--;
                    result--;
                }
                if(right < 0) {result = 0;return result;}
                nums[left] = nums[right];
                result--;
                right--;
            }
            left++;
        }
        return result;
    }
}