public class pattern_questions {
    static void pattern(int n){
        for(int rows = 1; rows<=n; rows++){
            for(int columns = 1; columns<=rows; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int rows = n; rows>=1; rows--){
            for(int columns = rows; columns>=1; columns--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int rows = 1; rows<=n; rows++){
            for(int columns = 1; columns<=rows; columns++){
                System.out.print(columns);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int rows = n; rows>=1; rows--){
            for(int columns = 1; columns<=rows; columns++){
                System.out.print(columns);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int rows = 1; rows<=n; rows++){
            for (int columns = 1; columns<=rows; columns++){
                System.out.print(rows);
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int rows = n; rows>=1; rows--){
            for (int columns = rows; columns>=1; columns--){
                System.out.print(rows);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int rows = n; rows>=1; rows--){
            for (int columns = n; columns>=1; columns--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int rows = 1; rows<=n; rows++){
            char ch = (char) ('A' +rows-1);
            for (int columns = 1; columns<=n; columns++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int rows = 1; rows<=n; rows++){
            char ch = (char) ('A' +rows-1);
            for (int columns = 1; columns<=rows; columns++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern6(4);
        pattern7(4);
        pattern8(4);
        pattern9(4);
    }
}
