package com.virusx;

import java.io.IOException;

public class KMaxMinEleArray {
    String pro = "Given an array arr[] and a number K where K is smaller than size of array, " + "\n" +
            "the task is to find the Kth smallest element in the given " + "\n" +
            "array. It is given that all array elements are distinct." + "\n" +
            "Expected Time Complexity: O(n)\n" + "\n" +
            "Input:\n" +
            "The first line of input contains an integer T, " + "\n" +
            "denoting the number of testcases. " + "\n" +
            "Then T test cases follow. Each test case consists of " + "\n" +
            "three lines. First line of each testcase contains an " + "\n" +
            "integer N denoting size of the array. Second line " + "\n" +
            "contains N space separated integer denoting elements " + "\n" +
            "of the array. Third line of the test case contains an " +
            "integer K.\n" + "\n" +
            "Output:\n" +
            "For each testcase, in a newline, " +
            "print the kth smallest element.\n" + "\n" +
            "Your Task:\n" +
            "Complete kthSmallest and return the kth smallest element.";

    public void run() throws IOException {
        System.out.println(pro + "\nEnter Input below-------------");
        int t = Input.singleInt();
        while (t-- > 0) {
            int n = Input.singleInt();
            int[] array = Input.spaceSeparatedIntArray();
            int k = Input.singleInt();
            System.out.println(solve(array, 0, n - 1, k));
        }
    }

    private int solve(int[] array, int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int pos = randomPartition(array, l, r);

            if (pos - l == k - 1) return array[pos];
            if (pos - l > k - 1) return solve(array, l, pos - 1, k);
            return solve(array, pos + 1, r, k - pos + l - 1);
        }
        return Integer.MAX_VALUE;
    }

    private int randomPartition(int[] array, int l, int r) {
        int n = r - l + 1;
        int pivot = (int) (Math.random() * n);
        swap(array, l + pivot, r);
        return partition(array, l, r);
    }

    private int partition(int[] array, int l, int r) {
        int x = array[r], i = l;
        for (int j = l; j < r - 1; j++) {
            if (array[j] <= x) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, r);
        return i;
    }

    private void swap(int[] array, int i, int r) {
        int temp = array[i];
        array[i] = array[r];
        array[r] = temp;
    }
}
