package com.virusx;

import java.io.IOException;

public class MaxMinEleArray {
    String probStats = "return minimum and maximum in an array. You program should make minimum number of comparisons. ";

    public void run() throws IOException {
        System.out.println(probStats + "\n\nInput array (space separated)");
        solve(Input.spaceSeparatedIntArray());
    }

    private void solve(int[] array) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}
