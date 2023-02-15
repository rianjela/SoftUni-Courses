package E08_Generics.E02_GenericBoxOfInteger;

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

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();

        for (T element : elements) {
            print.append(element.getClass().getName()).append(": ").append(element).append("\n");
        }

        return print.toString();
    }
}
