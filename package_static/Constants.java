package package_static;

public class Constants {
    static final double pi= 3.14159;
    public static double area(int r){
    
        return pi*r*r;

    }
    public static void main(String[] args) {

        Constants obj = new Constants();
        System.out.println("Area of circle is "+obj.area(5));
    }
}
