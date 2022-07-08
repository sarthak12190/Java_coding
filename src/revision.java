class Employeex{
    int salary;
    String name;
    public int getSalary(){return salary;}
    public void getName(){
        System.out.println("the name is" + name);
    }
}
class Square1{
    int side;
    public int area(){return side*side;}

}


public class revision {
    public static void main(String[] args) {
        Employeex Rohan = new Employeex();
        Rohan.name = "Rohan";
        Rohan.salary = 15000;
        Rohan.getName();
        System.out.println(Rohan.getSalary());


        Square1 square = new Square1();
        square.side = 5;
        System.out.println("the area is" + square.area());

    }


}
