class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1, 2, 4, 6]
        // [1, 2, 8, 24]
        // []
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            result[i]  = 1;
            for(int j=0; j<nums.length; j++) {
                if(i != j) {
                    result[i] = result[i] * nums[j];
                }
            }
        }
        return result;
    }
}  
