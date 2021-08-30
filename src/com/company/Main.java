package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayForInsertionSort = {1, 4, 6, 0, 9, 2, 3, 6, 7, 8, 9, 2, 3, 54, 5, 56, 77, 888, 7, 34, 52, 0, 1, 23, 1024};
        MergeSort.sort(arrayForInsertionSort);
        System.out.println(Arrays.toString(arrayForInsertionSort));

        int[] arrayForMergeSort = {1, 4, 6, 0, 9, 2, 3, 6, 7, 8, 9, 2, 3, 54, 5, 56, 77, 888, 7, 34, 52, 0, 1, 23, 1024};
        InsertionSort.sort(arrayForMergeSort);
        System.out.println(Arrays.toString(arrayForMergeSort));

    }

}