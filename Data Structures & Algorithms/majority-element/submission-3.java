class Solution {
    public int majorityElement(int[] nums) {

        int result = 0;
        int count = 0;
        for(int i : nums) {
            if(count == 0) {
                result = i;
            }
             
            if(result == i) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}