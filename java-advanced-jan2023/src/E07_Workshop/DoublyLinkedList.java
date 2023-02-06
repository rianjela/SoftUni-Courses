package E07_Workshop;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class DoublyLinkedList {

    class ListNode {
        int element;
        ListNode next;
        ListNode prev;

        public ListNode(int element) {
            this.element = element;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int size;


    //•	void addFirst(int element) – adds an element at the beginning of the collection
    public void addFirst(int element) {
        ListNode newNode = new ListNode(element);

        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    //•	void addLast(int element) – adds an element at the end of the collection
    public void addLast(int element) {
        ListNode newNode = new ListNode(element);

        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    //•	int get(int index) - Returns the element at the specified position in this list
    public int get(int index) {

        checkIndex(index);

        if (index <= this.size / 2) { // проверка дали индексът е в първата половина ОПТИМИЗАЦИЯ
            ListNode currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.element;
        } else { //// проверка дали индексът е в първата половина ОПТИМИЗАЦИЯ
            ListNode currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
            return currentNode.element;
        }
    }

    //•	int removeFirst() – removes the element at the beginning of the collection
    public int removeFirst() {
        checkEmpty();
        int firstElement = this.head.element;
        this.head = this.head.next;
        if (this.size == 1) { //single element
            this.tail = null;
        } else { // multiple element
            this.head.prev = null;
        }
        size--;
        return firstElement;
    }


    //•	int removeLast() – removes the element at the end of the collection
    public int removeLast() {
        checkEmpty();
        int element = this.tail.element;
        this.tail = this.tail.prev;
        if (this.tail == null) {
            this.head = null;
        } else {
            this.tail.next = null;
        }
        this.size--;
        return element;
    }

    //•	void forEach() – goes through the collection and executes a given action
    public void forEach(Consumer<Integer> consumer) {
        ListNode currentNode = this.head;
        while (currentNode != null) {
            consumer.accept(currentNode.element);
            currentNode = currentNode.next;
        }
    }

    //•	int[] toArray() – returns the collection as an array
    public int[] toArray() {
        int[] array = new int[this.size];
        int i = 0;
        ListNode currentNode = this.head;
        while (currentNode != null) {
            array[i++] = currentNode.element;
            currentNode = currentNode.next;
        }

        return array;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(String.format("Index: %d is out of bounds for size %d.", index, this.size));
        }
    }

    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("List is empty");
        }
    }
}
