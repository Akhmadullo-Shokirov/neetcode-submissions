class Solution {
    public long pickGifts(int[] gifts, int k) {
        int result = 0;
        Queue<Integer> heap = new PriorityQueue(Comparator.reverseOrder());

        for(int i : gifts) {
            heap.offer(i);
        }

        while(k != 0) {
            double max = heap.poll();
            int newValue = (int) Math.sqrt(max);
            heap.offer(newValue);
            k--;
        }

        while(heap.peek() != null) {
            result += heap.poll();
        }

        return result;
    }
}