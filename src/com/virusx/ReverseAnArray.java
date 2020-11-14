package com.virusx;

import java.io.IOException;
import java.util.Arrays;

public class ReverseAnArray {

    String probStat ="Given an array (or string), the task is to reverse the array/string.";

    public void run() throws IOException {
        System.out.println(probStat);
        System.out.println("Enter an array to reverse it(space separated): ");
        System.out.println(Arrays.toString(solve(Input.spaceSeparatedIntArray())));
    }

    private int[] solve(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
