package com.company;
import java.util.Arrays;

public class Swap_elements_arrays {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 9};
        swap(3,1,3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int arr, int index1, int index2){
        int temp = index1;
        index1=index2;
        index2 = temp;
        System.out.println(arr);

    }
}
