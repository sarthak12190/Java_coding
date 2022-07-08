public class Floor_sqrt {
    public static long floorsqrt(long x){
        long l = 0;
        long h = x;
        long mid = l+(h-l)/2;
        while (l<=h){
            if(mid*mid == x){
                return mid;
            }
            if(mid*mid <x){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return h;
    }

    public static void main(String[] args) {
        long x = 5;
        System.out.println(floorsqrt(x));
    }
}
