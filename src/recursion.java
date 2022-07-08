public class recursion {
    static void numbers(int n){
        System.out.println(n);
        numbers1(1);
    }
    static void numbers1(int n){
        System.out.println(n);
        numbers2(2);
    }
    static void numbers2(int n){
        System.out.println(n);
        numbers3(3);
    }
    static void numbers3(int n){
        System.out.println(n);
        numbers4(4);
    }
    static void numbers4(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
        numbers(0);
    }
}
