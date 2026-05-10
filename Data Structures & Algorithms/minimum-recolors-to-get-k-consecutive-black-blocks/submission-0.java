class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<blocks.length(); i++) {
            int count = 0;
            int currOp = 0;
            for(int j=i; j<blocks.length(); j++) {
                if(blocks.charAt(j) == 'W') {
                    currOp++;
                }
                count++;
                if(count == k) {
                    min = Math.min(min, currOp);
                    break;
                }
            }
        }
        return min;
    }
}