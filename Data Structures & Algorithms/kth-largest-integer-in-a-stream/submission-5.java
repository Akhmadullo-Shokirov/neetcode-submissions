class KthLargest {
    List<Integer> numbers = new ArrayList();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums) {
            add(i);
        }
    }
    
    public int add(int val) {
        numbers.add(val);
        heapify(numbers, numbers.size() - 1);
        if(numbers.size() > k) {
            numbers.set(0, numbers.remove(numbers.size() - 1));
            heapifyDown(0);
        }
        
        return numbers.get(0);
    }

    public void heapify(List<Integer> heap, int i) {
        int parent = (i - 1) / 2;

        // If the current node is smaller than its parent, swap
        if (i > 0 && heap.get(i) < heap.get(parent)) {
            // Swap the values
            int temp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, temp);

            // Recursively heapify the parent node
            heapify(heap, parent);
        }
    }

    private void heapifyDown(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < numbers.size() && numbers.get(left) < numbers.get(smallest)) smallest = left;
        if (right < numbers.size() && numbers.get(right) < numbers.get(smallest)) smallest = right;
        if (smallest != i) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(smallest));
            numbers.set(smallest, temp);
            heapifyDown(smallest);
        }
    }
}