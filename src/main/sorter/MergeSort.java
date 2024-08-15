package main.sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] values) {
        // mergesort implementation
        return values;
    }

    public int[] merge(int[] left, int[] right) {
        int[] aux = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (right[i] < left[j]) {
                aux[k++] = left[i++];
            } else {
                aux[k++] = right[j++];
            }
        }

        while (i < left.length) {
            aux[k++] = left[i++];

        }
        while (j < right.length) {
            aux[k++] = right[j++];
        }
        return null;
    }
}