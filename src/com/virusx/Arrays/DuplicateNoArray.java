package com.virusx.Arrays;

import com.virusx.Driver.Input;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateNoArray {

    String pro = "Given an array of integers numbers containing n + 1 \n" +
            "integers where each integer is in the range [1, n] inclusive.\n" +
            "\n" +
            "There is only one duplicate number in numbers, return this duplicate number.";

    public void run() throws IOException {
        System.out.println(pro+"\nEnter the input below-------------");
        int[] array = Input.spaceSeparatedIntArray();
//        System.out.println(naiveSol(array)); // time: O(n^2) space: O(1)
//        System.out.println(usingSet(array)); // time: O(n) space: O(n)
        System.out.println(usingBestSol(array)); // time: O(n) space: O(1)
    }

    private int usingBestSol(int[] array) {
        int tortoise = array[0];
        int hare = array[0];
        do {
            tortoise = array[tortoise];
            hare = array[array[hare]];
        } while (tortoise != hare);

        tortoise = array[0];
        while (tortoise != hare) {
            tortoise = array[tortoise];
            hare = array[hare];
        }

        return hare;
    }

    private int usingSet(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : array) {
            if(set.contains(ele))
                return ele;
            set.add(ele);
        }
        return -1;
    }

    private int naiveSol(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length;i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]) return array[i];
            }
        }
        return -1;
    }
}
