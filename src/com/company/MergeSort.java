package com.company;

public class MergeSort {

    protected static void sort(int[] array) {
        if (array.length == 1) {
            return;
        }
        int middleOfArray = array.length / 2;

        int[] leftArray = new int[middleOfArray];
        int[] rightArray = new int[array.length - middleOfArray];

        System.arraycopy(array, 0, leftArray, 0, middleOfArray);
        System.arraycopy(array, middleOfArray, rightArray, 0, array.length - leftArray.length);
        sort(leftArray);
        sort(rightArray);

        int l = 0;
        int r = 0;
        int i = 0;

        while (l < leftArray.length && r < rightArray.length) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }
        System.arraycopy(leftArray, l, array, i, leftArray.length - l);
        System.arraycopy(rightArray, r, array, i, rightArray.length - r);
    }
}
