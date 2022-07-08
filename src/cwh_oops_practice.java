class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("my salary is " + salary);

    }
}
public class cwh_oops_practice {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id = 12;
        john.id = 16;
        harry.name = "code with harry";
        john.name = "john here";
        harry.salary = 34;
        john.salary = 13;
         //System.out.println(harry.id);
        //System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
    }


}