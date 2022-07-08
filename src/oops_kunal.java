public class oops_kunal {
    public static void main(String[] args) {
        Student kunal = new Student();
        Student Sarthak = new Student();
        kunal.ChangeName("Axel");
        kunal.Greeting();
        Student Max = new Student(15, "max", 90);



        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(Sarthak.rno);
        System.out.println(Sarthak.name);
        System.out.println(Sarthak.marks);
        System.out.println(Max.rno);
        System.out.println(Max.name);
        System.out.println(Max.marks);

        //System.out.println(kunal.Max);
        //System.out.println(kunal.);

    }

}
class Student{
    int rno;
    String name;
    float marks;

    void Greeting(){
        System.out.println("HELLO " + name);

    }
    void ChangeName(String newName){
        name = newName;
    }
    Student(){
        this.rno = 20;
        this.name = "Sarthak";
        this.marks = 95.0f;
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
