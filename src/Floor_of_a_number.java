public class Floor_of_a_number {
    static int floor(int[]arr, int target){
        if(target<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[]arr = {2, 3, 5, 6, 7, 9, 13, 15, 16, 19};
        int target = 4;
        System.out.println(floor(arr,target));
    }
}
