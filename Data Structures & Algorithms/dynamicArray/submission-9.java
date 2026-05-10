class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        array = new int[this.capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(getSize() == getCapacity()) {
            resize();
        }
        set(getSize(), n);
        this.size++;
    }

    public int popback() {
        var lastElement = get(getSize() - 1);
        array[getCapacity() - 1] = 0;
        size--;
        return lastElement;
    }

    private void resize() {
        this.capacity = 2 * this.capacity;
        int[] newArray = new int[this.capacity];
        for(int i=0; i<array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
