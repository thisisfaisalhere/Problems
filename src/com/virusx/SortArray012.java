package com.virusx;

import java.io.IOException;
import java.util.Arrays;

public class SortArray012 {
    String prob = "Given an array of size N containing 0s, 1s, and 2s; \n" +
            "sort the array in ascending order.\n" +
            "\n" +
            "Input:\n" +
            "First line of input contains number of testcases T.\n" +
            " For each testcase, there will be two lines, first of which \n" +
            "will contain N. The second lines contains the elements of the array.\n" +
            "\n" +
            "Output: \n" +
            "Print sorted array.\n" +
            "\n" +
            "Your Task:\n" +
            "Complete the function sort012() that takes array and n \n" +
            "and sorts the array in place. \n" +
            "\n";

    public void run() throws IOException {
        System.out.println(prob + "\nEnter Input below--------");
        int t = Input.singleInt();
        while (t-- > 0) {
            int n = Input.singleInt();
            int[] array = Input.spaceSeparatedIntArray();
            System.out.println(Arrays.toString(solve(array)));
        }
    }

    private int[] solve(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0, temp;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0:
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
            }
        }
        return a;
    }
}
