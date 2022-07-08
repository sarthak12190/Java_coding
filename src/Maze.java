import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        paths("", 3, 3);
        System.out.println(pathlist("", 3, 3));

    }
    //printing number of ways
    static int count(int rows, int columns){
        if(rows==1 || columns==1){
            return 1;
        }
        int left = count(rows-1, columns);
        int right = count(rows,columns-1);
        //middle is for the diagonal elements
        int middle = count(rows-1, columns-1);
        return left+right+middle;
    }
    //printing all the ways
    //'d' stands for diagonal
    static void paths(String p , int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
        }
        if(r>1){
            paths(p+'D' , r-1, c);
        }
        if(c>1){
            paths(p+'R', r, c-1);
        }
        if(r<3){
            paths(p+'U', r+1, c);
        }
        if(c<3){
            paths(p+'L', r, c+1);
        }
        //if diagonal is allowed
        if(r>1 && c>1){
            paths(p+'d', r-1, c-1);
        }
    }
    //printing all the ways in the arraylist
    static ArrayList<String> pathlist(String p , int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathlist(p+'D' , r-1, c));
        }
        if(c>1){
            list.addAll(pathlist(p+'R', r, c-1));
        }
        //if diagonal is allowed
        if(r>1 && c>1){
            list.addAll(pathlist(p+'d', r-1, c-1));
        }
        return list;


    }
}
