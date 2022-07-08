import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[]arr = {3,5,4,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swaps(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    private static void swaps(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
