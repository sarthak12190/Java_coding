public class recusrsion_binarysearch {
    static int binarysearch1(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            binarysearch1(arr, target, start, mid-1);
        }
        return binarysearch1(arr, target, mid+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,5};
        int target = 6;
        System.out.println(binarysearch1(arr, target, 0, arr.length-1));
    }

}
