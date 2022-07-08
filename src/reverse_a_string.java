import java.util.Scanner;
public class reverse_a_string {
    static void Strings(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));

        }

    }
    public static void main(String[] args){

        Strings();



    }
}
