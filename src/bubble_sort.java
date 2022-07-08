import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [ ]arr = {3, 4, 6, 2, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[]arr){
        //run the steps for n-1 times
        for(int i = 0; i<arr.length; i++){
            //for each step max item will come to the last index of the array
            for(int j=1; j<arr.length-i; j++){
                //swap if the itam is less than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
