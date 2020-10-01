package sort;

import java.util.Arrays;
import java.util.List;

final class SortUtils {

    static <T> boolean swap(T[] array, int idx, int idy) {
        T swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }

    static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    static <T extends Comparable<T>> boolean greater(T v, T w) {
        return v.compareTo(w) > 0;
    }

    static void print(List<?> toPrint) {
        toPrint.stream()
                .map(Object::toString)
                .map(str -> str + " ")
                .forEach(System.out::print);

        System.out.println();
    }

    static void print(Object[] toPrint) {
        System.out.println(Arrays.toString(toPrint));
    }

    static <T extends Comparable<T>> void flip(T[] array, int left, int right) {
        while (left <= right) {
            swap(array, left++, right--);
        }
    }
}
