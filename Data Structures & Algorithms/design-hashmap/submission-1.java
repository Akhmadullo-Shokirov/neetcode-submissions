class MyHashMap {
    List<Integer> values;

    public MyHashMap() {
        this.values = new ArrayList<>();
        for(int i=0; i<=1000000; i++) {
            values.add(-1);
        }
    }
    
    public void put(int key, int value) {
        // if(values.size() == 0 || values.get(key) == -1) {
        //     for(int i=0; i<=key; i++) {
        //         values.add(-1);
        //     }
        // }
        values.set(key, value);
    }
    
    public int get(int key) {
        return values.get(key);
    }
    
    public void remove(int key) {
        values.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */