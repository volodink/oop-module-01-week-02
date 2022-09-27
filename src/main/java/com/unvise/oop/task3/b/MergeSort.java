package com.unvise.oop.task3.b;

public class MergeSort {
    public static double[] sort(double[] array, int arraySize) {
        double[] copiedArray = array.clone();
        if (arraySize < 2) return array;

        int mid = (int) Math.ceil((double) copiedArray.length / 2);
        double[] left = new double[mid];
        double[] right = new double[arraySize - mid];

        System.arraycopy(copiedArray, 0, left, 0, mid);
        if (arraySize - mid >= 0)
            System.arraycopy(copiedArray, mid, right, 0, arraySize - mid);

        left = MergeSort.sort(left, mid);
        right = MergeSort.sort(right, arraySize - mid);

        MergeSort.merge(copiedArray, left, right, mid, arraySize - mid);
        return copiedArray;
    }

    private static void merge(double[] array, double[] left, double[] right, int leftIndex, int rightIndex) {
        int i = 0, j = 0, k = 0;
        while (i < leftIndex && j < rightIndex) {
            if (left[i] <= right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }
        while (i < leftIndex)
            array[k++] = left[i++];

        while (j < rightIndex)
            array[k++] = right[j++];
    }
}
