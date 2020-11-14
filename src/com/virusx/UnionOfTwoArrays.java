package com.virusx;

import java.io.IOException;
import java.util.Arrays;

public class UnionOfTwoArrays {

    String pro = "second line of each test case contains N space \n" +
            "separated integers denoting elements of array A. \n" +
            "The third line of each test case contains M space \n" +
            "separated integers denoting elements of array B.\n" +
            "\n" +
            "Output:\n" +
            "Corresponding to each test case, print the count \n" +
            "of union elements of the two arrays";

    public void run() throws IOException {
        System.out.println(pro+"\nEnter Input below----");
        int t= Input.singleInt();
        while(t-- > 0) {
            int[] sizes = Input.spaceSeparatedIntArray();
            int[] arr1 = Input.spaceSeparatedIntArray();
            int[] arr2 = Input.spaceSeparatedIntArray();
            int[] union = new int[sizes[0] + sizes[1]];
            int arr1p = 0, arr2p = 0, filled = -1;
            while(arr1p < arr1.length || arr2p < arr2.length) {
                if(arr1p < arr1.length && contains(union, arr1[arr1p++], filled)) {
                    union[++filled] = arr1[arr1p-1];
                }
                if(arr2p < arr2.length && contains(union, arr2[arr2p++], filled)) {
                    union[++filled] = arr2[arr2p-1];
                }
            }
            System.out.println(Arrays.toString(union));
        }
    }

    private boolean contains(int[] union, int key, int filled) {
        for(int i = 0; i < filled + 1; i++) {
            if(union[i] == key) return false;
        }
        return true;
    }
}
