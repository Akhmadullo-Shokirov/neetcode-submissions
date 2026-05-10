class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i== 0) {
                prefix[i] = 1 * nums[i];
            } else {
                prefix[i] = prefix[i-1] * nums[i];
            }
        }

        for(int j=nums.length-1; j>=0; j--) {
            if(j == nums.length - 1) {
                postfix[j] = 1 * nums[j];
            } else {
                postfix[j] = postfix[j+1] * nums[j];
            }
        }

        for(int i=0; i<result.length; i++) {
            if(i == 0) {
                result[i] = postfix[i+1];
            } else if(i == result.length - 1) {
                result[i] = prefix[i-1];
            } else {
                result[i] = prefix[i-1] * postfix[i+1];
            }
        }
        return result;
    }
}  
