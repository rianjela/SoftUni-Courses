package E08_Generics.E08_CustomListSorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> listOfElements;

    public CustomList() {
        this.listOfElements = new ArrayList<>();
    }

    public void addElement(T element) {
        this.listOfElements.add(element);
    }

    public T removeElement(int index) {
        if (index >= 0 && index < listOfElements.size()) {
            return listOfElements.remove(index);
        }
        throw new IndexOutOfBoundsException("Invalid Index!");
    }

    public boolean contains(T element) {
        return this.listOfElements.contains(element);
    }

    public void swap(int index1, int index2) {
        T firstElement = this.listOfElements.get(index1);
        T secondElement = this.listOfElements.get(index2);

        this.listOfElements.set(index1, secondElement);
        this.listOfElements.set(index2, firstElement);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : listOfElements) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public void printMax() {
        System.out.println(this.listOfElements
                .stream()
                .max(Comparator.naturalOrder())
                .get());
    }

    public void printMin() {
        System.out.println(this.listOfElements
                .stream()
                .min((r, l) -> r.compareTo(l))
                .get());
    }

    public void print() {
        for (T el : listOfElements) {
            System.out.println(el);
        }
    }

    public void sort(){
        this.listOfElements.sort(Comparable::compareTo);
    }

}
