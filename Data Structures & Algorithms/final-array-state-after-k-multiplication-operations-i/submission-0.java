class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while(k != 0) {
           int index = findMinIndex(nums);
           nums[index] = nums[index] * multiplier;
           k--;
        }

        return nums;
    }

    private int findMinIndex(int[] nums) {
        Queue<Integer> minHeap = new PriorityQueue();
        for(int n : nums) {
            minHeap.offer(n);
        }

        int min = minHeap.poll();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == min)
                return i;
        }
        return -1;
    }
}