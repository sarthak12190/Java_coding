public class Binary_search_algorithm {
    static int Binary_search(int[] arr, int target, int n){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start) / 2;
            if(target<arr[mid]){
                end =mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9, 70, 80};
        int target = 9;
        int n = arr.length;
        System.out.println(Binary_search(arr,target, n));

    }
}
