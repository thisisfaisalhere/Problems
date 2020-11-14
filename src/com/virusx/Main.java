package com.virusx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> listOfQuestions = new ArrayList<>();
        listOfQuestions.add("Reverse An Array");
        listOfQuestions.add("Find the maximum and minimum element in an array");
        listOfQuestions.add("Find the \"Kth\" max and min element of an array ");
        listOfQuestions.add("Sort an array of 0s, 1s and 2s");
        listOfQuestions.add("Move all the negative elements to one side of the array");
        listOfQuestions.add("Union of two arrays");
        listOfQuestions.add("Cyclically rotate an array by one");
        listOfQuestions.add("find Largest sum contiguous SubArray");

        System.out.println("Enter Question no. to run it...");
        for (int i = 0; i < listOfQuestions.size(); i++) {
            System.out.println(i + 1 + ". " + listOfQuestions.get(i));
        }
        int n = new Scanner(System.in).nextInt();
        switch (n) {
            case 1:
                new ReverseAnArray().run();
                break;
            case 2:
                new MaxMinEleArray().run();
                break;
            case 3:
                new KMaxMinEleArray().run();
                break;
            case 4:
                new SortArray012().run();
                break;
            case 5:
                new MoveNegative().run();
                break;
            case 6:
                new UnionOfTwoArrays().run();
                break;
            case 7:
                new CyclicRotationArray().run();
                break;
            case 8:
                new ContinuousMaxSumArray().run();
                break;
            default:
                System.out.println("Enter valid Input");
                break;
        }
    }
}
