package com.dsa.search;

public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 7};

        System.out.println(Search(23, numbers));
        System.out.println(Search(11, numbers));
        System.out.println(Search(1, numbers));
        System.out.println(Search(7, numbers));
    }

    static String Search(int numberToFind, int[] numbers) {

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == numberToFind) {
                index = i;
                break;
            }
        }

        if (index == -1) return "Number Not Found: " + numberToFind;

        return "Number Found at: " + index;
    }
}
