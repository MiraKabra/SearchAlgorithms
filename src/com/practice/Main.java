package com.practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {3, 1, 7, 4, 10, 9, 2, 5,8, 6};
        BinarySearch bin = new BinarySearch();
        int index = bin.binarySearch(array,0, array.length - 1, 10);
        System.out.println(index);
    }
}
