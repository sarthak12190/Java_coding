public class String_skip_entire_string {
    public static void main(String[] args) {
        String up = "saappledas";
        System.out.println(skipString(up));


    }
    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else{
            return up.charAt(0) + skipString(up.substring(1));
        }
    }

}
