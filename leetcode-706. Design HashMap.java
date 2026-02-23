class MyHashMap {
    int arr[];
    public MyHashMap() {
        arr = new int[1000];
        Arrays.fill(arr, -1);
    }
    
    public void put(int key, int value) {
        if (key >= arr.length) {
            resize(key + 1);   // expand just enough
        }
        arr[key] = value;
    }
    
    public int get(int key) {
        if(key >= arr.length || arr[key] == -1) {
            return -1;
        }
        return arr[key];
    }
    
    public void remove(int key) {
        if(key < arr.length) {
            arr[key] = -1;
        }
    }

    private void resize(int newSize) {
        int[] newArr = new int[newSize];
        Arrays.fill(newArr, -1);   // VERY IMPORTANT

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */