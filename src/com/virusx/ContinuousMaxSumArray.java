package com.virusx;

import java.io.IOException;

public class ContinuousMaxSumArray {

    String pro = "Given an array arr of N integers. \n" +
            "Find the contiguous sub-array with maximum sum.";

    // 1 2 3 -2 5
    // -1 -2 -3 -4 -5
    // -2 -3 4 -1 -2 1 5 -3

    public void run() throws IOException {
        System.out.println(pro + "\nEnter input below-----------");
        int[] array = Input.spaceSeparatedIntArray();
//        naiveMethod(array);
        kadaneMethod(array);
    }

    private void kadaneMethod(int[] array) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        int left = 0, right = 0;
        for (int i = 0; i < array.length; i++) {
            maxEndingHere += array[i];
            if (maxEndingHere < array[i]) {
                maxEndingHere = array[i];
                left = i;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                right = i;
            }
        }
        System.out.print("Sub Array: ");
        for (int i = left; i <= right; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMax Sum: "+maxSoFar);
    }

    private void naiveMethod(int[] array) {
        int maxValue = Integer.MIN_VALUE, start = 0, end = 0;
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            if (maxValue < max) {
                maxValue = max;
                start = i;
                end = i;
            }
            for (int j = i + 1; j < array.length; j++) {
                max += array[j];
                if (maxValue < max) {
                    maxValue = max;
                    start = i;
                    end = j;
                }
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
