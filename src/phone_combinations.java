import java.util.ArrayList;

public class phone_combinations {
    public static void main(String[] args) {
        String p = "";
        String up = "12";
        keypad(p,up);
        System.out.println(keypadList(p, up));



    }
    static void keypad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3 ; i< digit * 3; i++){
            char ch = (char)('a'+i);
            keypad(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> keypadList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3 ; i< digit * 3; i++){
            char ch = (char)('a'+i);
            list.addAll(keypadList(p+ch, up.substring(1)));
        }
        return list;
    }
}
