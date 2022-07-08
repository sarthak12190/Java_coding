public class String_remove_all_a {
    public static void main(String[] args) {
        String p = "";
        String up = "asgfafas";
        skip(p,up);

    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
}
