public class binarysearch2 {
    static int Binary_srearch(int[] arr, int target, int n){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid -1;
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
        int[] arr = {3, 4, 6, 7, 10};
        int target = 7;
        int n = arr.length;
        System.out.println(Binary_srearch(arr, target, n));
    }
}
