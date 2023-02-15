package E08_Generics.E03_GenericSwapMethodString;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void swap(int index1, int index2){
        T firstElement = this.elements.get(index1);
        T secondElement = this.elements.get(index2);

        this.elements.set(index1, secondElement);
        this.elements.set(index2, firstElement);
    }


    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();

        for (T element : elements) {
            print.append(element.getClass().getName()).append(": ").append(element).append("\n");
        }

        return print.toString();
    }
}
