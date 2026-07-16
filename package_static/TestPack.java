package package_static;

import  package_static;

public class TestPack {
public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.display();
        System.out.println(StaticMethod.x);
        System.out.println(obj.y);
        StaticMethod.show();
    }
}
//Non static can only be accessed by creating an object of the class. 
// Static can be accessed without creating an object of the class.