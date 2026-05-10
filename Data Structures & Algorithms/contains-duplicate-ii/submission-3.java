class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> values = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(values.get(nums[i]) != null) {
                for(int j : values.get(nums[i])) {
                    if(i!=j && Math.abs(i-j) <=k) {
                        return true;
                    }
                }
                values.get(nums[i]).add(i);
            } else{
                List<Integer> indices = new ArrayList();
                indices.add(i);
                values.put(nums[i], indices);
            }
        }
        return false;
    }
}