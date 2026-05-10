class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue(Comparator.reverseOrder());
        for(int i : stones) {
            heap.offer(i);
        }

        while(heap.size()  > 1) {
            int x = heap.poll();
            int y = heap.poll();
            if(x < y) {
                heap.add(y-x);
            } else if(x > y) {
                heap.add(x- y);
            }
        }

        if(heap.size() == 0) return 0;
        return heap.peek();
    }
}
