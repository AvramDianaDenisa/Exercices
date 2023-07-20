package GenericEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Clasă generică care implementează interfața Comparable și administrează o colecție de elemente.
class GenericCollection<T extends Comparable<T>> {
    private List<T> items;

    public GenericCollection() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void sortItems() {
        Collections.sort(items, (a, b) -> a.compareTo(b)); //lambda
    }

    public void printItems() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}
