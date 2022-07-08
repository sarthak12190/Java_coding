public class Search_in_string {
    static Boolean Search_string(String str , char target){
        if (str.length() == 0){
            return false;
        }
        for(int i = 0; i<str.length(); i++) {
            if(target == str.charAt(i)){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Sarthak";
        char target = 'r';
        System.out.println(Search_string(name,target));

    }
}
