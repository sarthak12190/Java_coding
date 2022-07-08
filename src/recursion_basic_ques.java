public class recursion_basic_ques {
    static void ques1(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        ques1(n+1);
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);

    }
    public static void main(String[] args) {
        ques1(1);
        System.out.println(fact(5));
        System.out.println(sum(10));
        System.out.println(sumOfDigits(156));
        System.out.println(prodOfDigits(25));
        reverse(1234);
        System.out.println(sum);
        System.out.println(count(204506));
        System.out.println(noOfSteps(45));

    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10)+sum((n%10 + sumOfDigits(n/10))-1);
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    static int prodOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * prodOfDigits(n/10);
    }
    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int reminder = n%10;
        sum = sum * 10+reminder;
        reverse(n/10);

    }
    static int count(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);


    }
    static int noOfSteps(int num){
        return helper2(num, 0);
    }
    static int helper2(int num, int steps){
        if(num==0){
            return steps;

        }
        if(num%2==0){
            return helper2(num/2, steps+1);
        }
        return helper2(num-1, steps+1);
    }

}
