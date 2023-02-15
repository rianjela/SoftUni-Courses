package E09_IteratorsAndComparators.E02_Collection;

import java.util.List;

public class ListyIterator {

    private List<String> infoList;
    private int index;

    public ListyIterator(List<String> infoList) {
        this.infoList = infoList;
        if (infoList.isEmpty()) {
            this.index = -1;
        } else {
            this.index = 0;
        }
    }

    public List<String> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<String> infoList) {
        this.infoList = infoList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex() {
        this.index = index;
    }

    public boolean move() {
        if (this.index < this.infoList.size() - 1) {
            this.index++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext() {
        return this.index < this.infoList.size() - 1;
    }

    public void print() {
        if (!this.infoList.isEmpty()) {
            System.out.println(this.infoList.get(this.index));
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    public void printAll() {
        int counter = 0;
        while (counter != this.infoList.size()) {
            System.out.print(this.infoList.get(counter) + " ");
            counter++;
        }
        System.out.println();
    }

}
