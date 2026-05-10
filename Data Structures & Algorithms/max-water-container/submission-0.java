class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int i=0; i<heights.length - 1; i++) {
            for(int j=i+1; j<heights.length; j++) {
                if(heights[i] > heights[j]) {
                    max = Math.max(heights[j] * (j-i), max);
                } else {
                    max = Math.max(heights[i] * (j-i), max);
                }
            } 
        }
        return max;
    }
}
