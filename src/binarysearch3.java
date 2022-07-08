public class binarysearch3 {
    static int binarysearch_3(int[]arr, int target, int n){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid  = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 4, 9};
        int target = 5;
        int n = arr.length;
        //binarysearch_3(arr,target,n);
        System.out.println(binarysearch_3(arr, target, n));

    }
}
