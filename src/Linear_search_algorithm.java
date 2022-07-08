public class Linear_search_algorithm {
    static int linear_search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }


        }
        return -1;


    }
    public static void main(String[] args){
        int[] numbers = {5 , 7 , 4 , 8 , 9 , 14, 10};
        int target = 9;
        System.out.println(linear_search(numbers,target));

    }

}
