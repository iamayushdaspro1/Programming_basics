package sort;

import static sort.SortUtils.less;
import static sort.SortUtils.print;

class CycleSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;

        for (int j = 0; j <= n - 2; j++) {
            
            T item = arr[j];

            int pos = j;
            for (int i = j + 1; i < n; i++)
                if (less(arr[i], item)) pos++;

            if (pos == j) continue;

            while (item.compareTo(arr[pos]) == 0)
                pos += 1;

            if (pos != j) {
                item = replace(arr, pos, item);
            }

            while (pos != j) {
                pos = j;

                for (int i = j + 1; i < n; i++)
                    if (less(arr[i], item)) {
                        pos += 1;
                    }


                while (item.compareTo(arr[pos]) == 0)
                    pos += 1;

                if (item != arr[pos]) {
                    item = replace(arr, pos, item);
                }
            }
        }

        return arr;
    }

    private <T extends Comparable<T>> T replace(T[] arr, int pos, T item) {
        T temp = item;
        item = arr[pos];
        arr[pos] = temp;
        return item;
    }


    public static void main(String[] args) {
        Integer arr[] = {4, 23, 6, 78, 1, 26, 11, 23, 0, -6, 3, 54, 231, 9, 12};
        CycleSort cycleSort = new CycleSort();
        cycleSort.sort(arr);

        System.out.println("After sort : ");
        print(arr);
    }

}
