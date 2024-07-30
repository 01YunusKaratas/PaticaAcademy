package GENERİC;

@SuppressWarnings("unchecked")
public class MyLıst<T> {
    private int capacity;
    private T[] genericArray;

    // Default constructor with initial capacity
    public MyLıst() {
        this.capacity = 10;
        this.genericArray = (T[]) new Object[this.capacity];
    }

    // Constructor with specified capacity
    public MyLıst(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        this.genericArray = (T[]) new Object[this.capacity];
    }

    // Size Method
    public int size() {
        int sizeCount = 0;
        for (T element : this.genericArray) {
            if (element != null) {
                sizeCount++;
            }
        }
        return sizeCount;
    }

    // Add method
    public void add(T data) {
        if (this.size() >= this.capacity) {
            throw new ArrayIndexOutOfBoundsException("List is full");
        }
        this.genericArray[this.size()] = data;
    }

    // Get method
    public T get(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return this.genericArray[index];
    }

    // Set method
    public void set(int index, T data) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        this.genericArray[index] = data;
    }

    // Remove method
    public void remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        for (int i = index; i < this.size() - 1; i++) {
            this.genericArray[i] = this.genericArray[i + 1];
        }
        this.genericArray[this.size() - 1] = null;
    }

    // Find index of data
    public int indexOf(T data) {
        for (int i = 0; i < this.size(); i++) {
            if (this.genericArray[i] != null && this.genericArray[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Find last index of data
    public int lastIndexOf(T data) {
        for (int i = this.size() - 1; i >= 0; i--) {
            if (this.genericArray[i] != null && this.genericArray[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return this.size() == 0;
    }

    // Convert to array
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            array[i] = this.genericArray[i];
        }
        return array;
    }

    // Clear the list
    public void clear() {
        for (int i = 0; i < this.size(); i++) {
            this.genericArray[i] = null;
        }
    }

    // Get a sublist
    public MyLıst<T> subList(int start, int finish) {
        if (start < 0 || finish > this.size() || start >= finish) {
            throw new IllegalArgumentException("Invalid start or finish index");
        }
        MyLıst<T> subList = new MyLıst<>(finish - start);
        for (int i = start; i < finish; i++) {
            subList.add(this.genericArray[i]);
        }
        return subList;
    }

    // Check if list contains data
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Getter and Setter for capacity
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[this.capacity];
        System.arraycopy(this.genericArray, 0, newArray, 0, Math.min(this.size(), this.capacity));
        this.genericArray = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.genericArray[i]);
            if (i < this.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
