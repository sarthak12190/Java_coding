import java.util.ArrayList;

public class Dice_roll {
    public static void main(String[] args) {

        roll_dice("", 4);
        System.out.println(dice_ret("", 4));

    }
    static void roll_dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i<=6 && i<=target; i++){
            roll_dice(p+i, target-i);
        }
    }
    static ArrayList<String> dice_ret(String p , int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i =1; i<=6 && i<=target; i++ ){
            list.addAll(dice_ret(p+i, target-i));
        }
        return list;
    }

}
