package sort;

import java.util.Arrays;
import java.util.List;

public interface SortAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] unsorted);

    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> unsorted) {
        return Arrays.asList(sort(unsorted.toArray((T[]) new Comparable[unsorted.size()])));
    }

}
