package com.bptn.course.week4.sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {
	  
    public static void main(String[] args) {
        // Initialize an integer array
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));
        // Sort the array using quicksort
        QuickSort.sort(arr);
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }

        // call the quick sort with the left and right indices
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        //if left index is less than the right index, then there is more than one element to sort
        if(left < right) {
            //get the partition index by calling the partition method
            int partitionIndex = partition(arr, left, right);
            //sort the element to the left of the partition index
            quickSort(arr, left, partitionIndex - 1);
            //sort the elements to the right of the partition index
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        //choose the first element as the pivot
        int pivot = arr[left];
        //initialize the left and right pointers
        int i = left +1;
        int j = right;
        while (i <= j) {
            //find the element from the left side that is greater than the pivot
            while (i<=j && arr[i] <= pivot) {
                i++;
            }
            //find the element from the right side that is less than the pivot
            while (i<=j && arr[j] > pivot) {
                j--;
            }
            //swap the elements at i and j
            if (i < j) {
                swap(arr, i, j);
            }
        }
        //put the pivot in its correct position
        swap(arr, left, j);
        //return the index of the pivot
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        //swap the elements at indices i and j
        int temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;    
    }
}