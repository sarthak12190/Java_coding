import java.util.Arrays;

public class kth_smallest_largest_array {
    public static int kthsnallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,5,9};
        int k = 2;
        System.out.println(kthsnallest(arr, k));
    }

}
