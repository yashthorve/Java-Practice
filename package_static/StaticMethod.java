package package_static;

public class StaticMethod {

    static int x=20;
    int y = 10;
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    static void show(){
        System.out.println(x);
       // System.out.println(y); //Compile time error
    } 
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.display();
        System.out.println(x);
        System.out.println(obj.y);
        show();
    
    }
}
