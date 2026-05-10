class Solution {
    public int[] twoSum(int[] numbers, int target) {
        var left = 0;
        var right = numbers.length - 1;
        int[] result = new int[2];
        while(left < right) {
            int currentSum = numbers[left] + numbers[right];
            if(currentSum > target) {
                right--;
            } else if(currentSum < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }
        return result;
    }
}
