class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int max = 1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            int count = 0;
            if(nums[i+1] - nums[i] == 1) {count++;}
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] - nums[j-1] == 1) {
                    count++;
                } else if(nums[j] - nums[j-1] == 0) {
                    continue;
                } else {break;}
            }
        max = Math.max(count, max);
        }
        return max;
    }
}
