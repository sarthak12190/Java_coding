public class String_subset {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        subseq(p,up);

    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch , up.substring(1));
        subseq(p, up.substring(1));

    }
}
