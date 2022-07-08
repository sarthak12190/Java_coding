import java.util.Arrays;

public class search_in_2d_array {
    static int[] search_2d(int[][]arr, int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }

            }
        }


        return new int[0];
    }
    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 8},
                {5, 78, 90},
                {12, 45, 60}
        };
        int target = 5;
        int[] ans = search_2d(arr , target);
        System.out.println(Arrays.toString(ans));
    }
}
