package com.company;

import java.util.Arrays;

public class InPlaceSort {

    private void swap(int arr[], int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    public int[] bubbleSort(int[] arr){
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                    swapped = true;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {3, 2, 2, 1, 0, 2, 5, 6, 2, 1, 2, 3, 5, 5, 42, 12, 99, 42, 0};
        //          {2., 2, 1, 0, 3}
        //          {2., 1, 0, 2, 3}
        //          {1, 0, 2., 2, 3}
        InPlaceSort bubby = new InPlaceSort();
        bubby.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
