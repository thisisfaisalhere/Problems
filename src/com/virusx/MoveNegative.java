package com.virusx;

import java.io.IOException;
import java.util.Arrays;

public class MoveNegative {
    String prob = "An array contains both positive and negative numbers in \n" +
            "random order. Rearrange the array elements so that all negative \n" +
            "numbers appear before all positive numbers.\n" +
            "Input : space separated array...";

    public void run() throws IOException {
        System.out.println(prob + "\nEnter input below--------");
        int[] array = Input.spaceSeparatedIntArray();
        System.out.println(Arrays.toString(solve(array)));
    }

    private int[] solve(int[] array) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            if (array[left] < 0 && array[right] < 0) {
                left++;
            } else if(array[left] < 0 && array[right] > 0) {
                left++;
                right--;
            } else if(array[left] > 0 && array[right] < 0) {
                swap(array, left, right);
                left++;right--;
            } else if (array[left] > 0 && array[right] > 0){
                right--;
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int left) {
        int temp = array[i];
        array[i] = array[left];
        array[left] = temp;
    }
}
