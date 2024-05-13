package com.dsa.search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

        System.out.println(Search(19, numbers));
    }

    static String Search(int numberToFind, int[] numbers) {

        int countOfSearch = 0;
        int index = -1;
        int left = 0;
        int right = numbers.length - 1;
        int middle = numbers.length / 2;

        while (left < right) {

            countOfSearch++;

            if (numbers[middle] == numberToFind) {
                index = middle;
                return "FOUND AT: " + index + ", NUMBER OF SEARCH: " + countOfSearch;
            }
            else if (numberToFind < numbers[middle]) {
                right = middle - 1;
                middle = (Math.abs(left + right) + 1) / 2;
            }
            else if (numberToFind > numbers[middle]) {
                left = middle + 1;
                int newMiddle = left + ((Math.abs(left - right)) / 2);
                middle = newMiddle;
            }
        }

        if (numbers[left] == numberToFind) return "FOUND AT: " + left + ", COUNT OF SEARCH: " + countOfSearch;

        if (numbers[right] == numberToFind) return "FOUND AT: " + right + ", COUNT OF SEARCH: " + countOfSearch;

        return "NOT FOUND: " + numberToFind;
    }
}
