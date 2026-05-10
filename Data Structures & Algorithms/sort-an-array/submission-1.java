class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1) return nums;
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        int[] leftArray = Arrays.copyOfRange(nums, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(nums, mid + 1, right + 1);
        return merge(sortArray(leftArray), sortArray(rightArray));
    }

    public int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int curr = 0;
        int aIndex = 0;
        int bIndex = 0;
        while(aIndex < a.length && bIndex < b.length) {
            if(a[aIndex] < b[bIndex]) {
                result[curr] = a[aIndex];
                aIndex++;
            } else {
                result[curr] = b[bIndex];
                bIndex++;
            }
            curr++;
        }

        if(aIndex == a.length) {
            while(bIndex < b.length) {
                result[curr] = b[bIndex];
                curr++;
                bIndex++;
            }
        }

        if(bIndex == b.length) {
            while(aIndex < a.length) {
                result[curr] = a[aIndex];
                aIndex++;
                curr++;
            }
        }

        return result;
    }
}