public class min_value_search {
    static int min(int[] arr){
        int ans = arr[0];
        for(int i =1; i< arr.length; i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {18 , 12, -7, 28, 5, 6};
        System.out.println(min(arr));


    }
}
