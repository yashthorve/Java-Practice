package package_static;

class Student{
    int rollno;
    String name;
    static String college="ABC";

    Student(int r ,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno + " " +name+" "+ college);
    }
}
public class TestVariable {
    public static void main(String[] args) {
        Student s1=new Student(111,"Yash");
        Student s2=new Student(112,"Ayush");
        s1.display();
        s2.display();
    
    }
}
