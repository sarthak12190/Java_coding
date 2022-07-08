public class babbar_questions {
    public static void main(String[] args) {
        int[] arr = {4, 5, 85, 90, 12};
        int max = arr[0];
        int min = arr[0];
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];

            }

        }
        System.out.println(max);
        System.out.println(min);

    }

}
