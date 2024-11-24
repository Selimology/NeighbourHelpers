public class Vector<T> {
    private Object[] data;
    private int capacity;
    private int count;

    public Vector(int capacity) {

        if (capacity <= 0) {
            System.out.println("Capacity is 0 or below 0");
            //I am setting a default capacity if it is below or equal to 0
            capacity = 5;
        }

        this.capacity = capacity;
        this.data = new Object[capacity];
        this.count = 0;
    }

    /*
        1. I increase the old capacity by double.
        2. Create a new array with the new capacity.
        3. Loop through while assigning the data to the new index spot in newData array.
        4. Lastly, we replace the old data array with the new one.
     */
    private void resizeCapacity() {
        int newCapacity = capacity * 2;
        Object[] newData = new Object[newCapacity];

        for (int i = 0; i < count; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }


    public void addItem(T item) {
        // If we reach the capacity, scale the array.
        if (count == capacity) {
            resizeCapacity();
        }
        data[count] = item;
        count++;
    }

    public T getItem(int index) {
        return (T) data[index];
    }

    public int getCurrentSize() {
        return count;
    }


}
