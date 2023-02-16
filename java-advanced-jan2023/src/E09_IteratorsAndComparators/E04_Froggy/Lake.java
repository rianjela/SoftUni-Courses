package E09_IteratorsAndComparators.E04_Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lake implements Iterable<Integer> {
    List<Integer> listNums;

    public Lake(String input) {
        this.listNums = new ArrayList<>(Arrays.stream(input.split(",\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList()));
    }

    public void jump() {
        List<Integer> jumpedOnList = new ArrayList<>();
        IntStream.range(0, this.listNums.size()).filter(i -> i % 2 == 0).forEach(i -> jumpedOnList.add(this.listNums.get(i)));
        IntStream.range(0, this.listNums.size()).filter(i -> i % 2 != 0).forEach(i -> jumpedOnList.add(this.listNums.get(i)));
        System.out.println(jumpedOnList.toString().replaceAll("[\\[\\]]", ""));
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int num : listNums) {
            action.accept(num);
        }
    }
}
