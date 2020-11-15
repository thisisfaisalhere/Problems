package com.virusx.Arrays;

import com.virusx.Driver.Input;

import java.io.IOException;
import java.util.Arrays;

public class CyclicRotationArray {
    String pro = "Given an array, cyclically rotate an array by one.\n" +
            "\n" +
            "Input:\n" +
            "The first line of input contains an integer T denoting the number \n" +
            "of test cases. Then T test cases follow. Each test case contains an integer n \n" +
            "denoting the size of the array. Then following line contains 'n' \n" +
            "integers forming the array. \n" +
            "\n" +
            "Output:\n" +
            "Output the cyclically rotated array by one.";

    public void run() throws IOException {
        System.out.println(pro + "\nEnter Input below-----------");
        int t = Input.singleInt();
        while (t-- > 0) {
            int n = Input.singleInt();
            int[] array = Input.spaceSeparatedIntArray();
            System.out.println(Arrays.toString(rotate(array, n)));
        }
    }

    private int[] rotate(int[] array, int n) {
        for (int i = n - 1, j = n - 2; i >= 0 && j >= 0; i--, j--) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
