//problem1
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public void getName(){
        System.out.println("my name is " + name);
    }
    public void setName( String m){
        name = m;
    }

}
//problem 2
class cellphone{
    public void ringing(){
        System.out.println("ringing....");


    }
    public void vibrate(){
        System.out.println("vibrating...");

    }
    public void callAFriend(){
        System.out.println("Calling Adwait");
    }
}

//problem 3

class square{
    int side;
    int area;
    int perimeter;
    public void calculate(){
        System.out.println(side);
        System.out.println(area);
        System.out.println(perimeter);
    }


}
//probleam 4
class rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    public void calculate2(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(area);
        System.out.println(perimeter);

    }
}


public class oops_questions {
    public static void main(String[] args) {
        Employee1 ron = new Employee1();
        ron.salary = 15;
        ron.name = "Ronald";
        ron.setName("Draco");
        System.out.println("my salary is " + ron.getSalary());
        ron.getName();

        cellphone oneplus = new cellphone();
        oneplus.callAFriend();
        oneplus.ringing();
        oneplus.vibrate();

        square side1 = new square();
        side1.side = 5;
        side1.area = side1.side * side1.side;
        side1.perimeter = 4 * side1.side;
        System.out.println("the side , area , perimeter are");
        side1.calculate();

        rectangle side2 = new rectangle();
        side2.length = 3;
        side2.breadth = 4;
        side2.area = side2.length * side2.breadth;
        side2.perimeter =  2 * (side2.length + side2.breadth);
        side2.calculate2();




    }
}
