public class rotated_binary {
    static int search(int[] nums, int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = start+ (end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[start]<=nums[mid]){
            if(target<=nums[mid] && target>=nums[start]){
                return search(nums, target, start, mid-1);
            }
            else{
                return search(nums, target, mid+1, end);
            }
        }
        if(target>=nums[mid] && target<=nums[end]){
            return search(nums, target, mid+1, end);
        }
        return search(nums, target, start, mid-1);

    }

    public static void main(String[] args) {
        int[] nums = {2,3,45,6,5,9};
        System.out.println(search(nums, 3,0, nums.length-1));
    }
}
