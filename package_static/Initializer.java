package package_static;

public class Initializer {
    static int val;
    static {
          val = 1000;

    }
    public static void main(String[] args) {
        System.out.println("x before creating instance  is "+Initializer.val);
        Initializer obj = new Initializer();
        System.out.println("x is " + Initializer.val);
    }
}
