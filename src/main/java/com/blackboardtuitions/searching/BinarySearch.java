package com.blackboardtuitions.searching;

public class BinarySearch {

    public static int binarySearchRecursion(int[] array, int key){
        if(array == null)
            return -1;
        return binarySearchRecursion(array, key, 0, array.length-1);
    }

    private static int binarySearchRecursion(int[] array, int key, int start, int end){
        if (start > end)
            return -1;
        int mid = start+(end-start)/2;
        if (array[mid] == key)
            return mid;
        else if(array[mid] < key)
            return binarySearchRecursion(array, key, mid+1, end);
        else
            return binarySearchRecursion(array, key, start, mid-1);
    }

    public static int binarySearchIterative(int[] array, int key){
        if(array == null)
            return -1;
        int end = array.length-1, start=0;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(array[mid] == key)
                return mid;
            if(array[mid] < key)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }

}