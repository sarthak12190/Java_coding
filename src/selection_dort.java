import java.util.Arrays;

public class selection_dort {
    static void selectionsort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            //find maximum item and swap it with its coreect index
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0,last);
            swap(arr, maxindex, last);
        }

    }




    static void swap(int[]arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[]arr, int start, int end){
        int max = start;
        for(int i = 0; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {4,3,2,6,7};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
