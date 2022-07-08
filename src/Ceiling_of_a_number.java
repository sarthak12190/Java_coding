public class Ceiling_of_a_number {
    static int ceiling(int[]arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start= arr[0];
        int end= arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
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
        return start;
    }
    public static void main(String[] args) {
        int [] arr ={2, 3, 4, 6, 7, 9, 14, 16, 18, 19};
        int target = 20;
        System.out.println(ceiling(arr,target));
    }
}
