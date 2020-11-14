package com.virusx;

import java.io.IOException;

public class MinimizeTheHeightArray {

    String pro = "Given an array arr[] denoting heights of N towers \n" +
            "and a positive integer K, you have to modify the height \n" +
            "of each tower either by increasing or decreasing them by K \n" +
            "only once. After modifying, height should be a non-negative \n" +
            "integer. \n" +
            "Find out what could be the possible minimum difference \n" +
            "of the height of shortest and longest towers after you \n" +
            "have modified each tower.";

    public void run() throws IOException {
        System.out.println(pro + "\nEnter the Input below-----------");
        int[] array = Input.spaceSeparatedIntArray();
        int k = Input.singleInt();
        solve(array, k);
    }

    private void solve(int[] array, int k) {
        int max = array[0], min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        int ans = (max - k) - (min + k);
        System.out.println(ans);
    }
}
