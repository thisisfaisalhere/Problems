package com.virusx.Arrays;

import com.virusx.Driver.Input;

import java.io.IOException;

public class MinNoOfJumpsArray {

    String pro = "Given an array of integers where each element represents \n" +
            "the max number of steps that can be made forward from that element. \n" +
            "Write a function to return the minimum number of jumps to reach the end \n" +
            "of the array (starting from the first element). If an element is 0, then \n" +
            "cannot move through that element.\n" +
            "\n" +
            "Input: \n" +
            "The first line contains an integer T, depicting total number of test cases.  \n" +
            "Then following T lines contains a number n denoting the size of the array.\n" +
            " Next line contains the sequence of integers space separated\n" +
            "\n" +
            "Output:\n" +
            "For each testcase, in a new line, print the minimum number of jumps. \n" +
            "If answer is not possible print -1.";

    // sample input-------
    //2
    //11
    //1 3 5 8 9 2 6 7 6 8 9
    //6
    //1 4 3 2 6 7
    // sample output---------
    //3
    //2
    public void run() throws IOException {
        System.out.println(pro + "\nEnter Input below-----------");
        int t = Input.singleInt();
        while (t-- > 0) {
            int size = Input.singleInt();
            int[] array = Input.spaceSeparatedIntArray();
//            System.out.println(naiveMethod(array));
            System.out.println(bestMethod(array));
        }
    }

    private int bestMethod(int[] array) {
        if (array.length <= 1) return 0;

        if (array[0] == 0) return -1;

        int maxReach = array[0], step = array[0], jump = 1;
        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) return jump;
            maxReach = Math.max(maxReach, i + array[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach) return -1;
                step = maxReach - i;
            }
        }
        return -1;
    }

    private int naiveMethod(int[] array) {
        if (array.length <= 1) return 0;
        int curPos = 0, count = 0;
        while (curPos < array.length - 1 && curPos != -1) {
            int curPosValue = array[curPos];
            curPos = getNextPos(array, curPosValue, curPos);
            count++;
        }
        return curPos != -1 ? count : -1;
    }

    private int getNextPos(int[] array, int curPosValue, int curPos) {
        if (curPos + curPosValue > array.length) return array.length;
        int max = Integer.MIN_VALUE, maxIndex = -1;
        for (int i = curPos + 1; i <= curPos + curPosValue; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
