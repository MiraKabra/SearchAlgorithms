package com.practice;

public class BinarySearch {

    /**
     *
     * @param array
     * @param val
     * @return index at which val is located
     */
    public int binarySearch(int[] array, int left, int right, int val){
        if(right < left){
            return -1;
        }
        int mid = (left + right)/2;

        if(array[mid] == val){
            return mid;
        }
        else if(val < array[mid]){
            return binarySearch(array, left, mid - 1 , val);
        }
        else {
            return binarySearch(array, mid + 1, right , val);
        }
    }
}
