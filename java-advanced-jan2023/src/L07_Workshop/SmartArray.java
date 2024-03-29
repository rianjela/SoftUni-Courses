package L07_Workshop;

import java.util.function.Consumer;

public class SmartArray {


    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException(String.format("Index %d is out of bounds with length %d", index, this.size));
        }

    }
    private void resize() {
        this.capacity *= 2;
        int[] copyArr = new int[this.capacity];

        System.arraycopy(this.data, 0, copyArr, 0, this.data.length);

        this.data = copyArr;
    }
    private void shrink() {
        this.capacity /= 2;
        int[] copyArr = new int[this.capacity];

        System.arraycopy(this.data, 0, copyArr, 0, this.size);

        this.data = copyArr;

    }
    private void shiftLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.size - 1] = 0;

    }
    private void shiftRight(int index) {
        for (int i = this.size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    //•	void add(int element) - Adds the given element to the end of the list
    public void add(int element) {
        // increase the capacity if needed

        if (this.size == this.capacity) {
            resize();
        }
        this.data[this.size] = element;
        this.size++;
    }

    //•	int get(int index) - Returns the element at the specified position in this list
    public int get(int index) {
        checkIndex(index);
        return this.data[index];
    }

    //•	int remove(int index) - Removes the element at the given index
    public int remove(int index) {
        checkIndex(index);
        int element = this.data[index];

        this.data[index] = 0;

        shiftLeft(index);
        this.size--;

        if (this.size <= capacity / 4) {
            shrink();
        }

        return element;
    }

    //•	bool contains(int element) - Checks if the list contains the given element returns (True or False)
    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    //•	void insert(int index, int element) - Adds element at the specific index, the element at this index gets shifted to the right alongside any following elements, increasing the size
    public void insert(int index, int element) {
        checkIndex(index);
        if (index == size - 1) {
            add(this.data[this.size - 1]);
            this.data[this.size - 2] = element;
        } else {
            if (this.size == this.capacity) {
                resize();
            }
            shiftRight(index);
            this.size++;
            this.data[index] = element;
        }
    }

    //•	void forEach(Consumer<Integer> consumer
    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
}
