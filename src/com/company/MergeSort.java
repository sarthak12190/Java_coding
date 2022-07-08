package com.company;

public class MergeSort {
    public static void conquer(int arr, int si, int mid, int ei){
        int merge[] = new int[ei - si +1];


    }
    public static void divide(int arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

    }
    public static void main(){
        int arr[] = {6, 4, 7, 8, 5, 2};
        int n = arr.length;
    }
}
