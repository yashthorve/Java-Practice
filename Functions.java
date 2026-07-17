public class Functions {
    //tomorrow fibonacci 
    public static void printhello(){ 
        System.out.println("Hello World");
    }
    public static void sum(int a,int b){//parameters 
         int temp=a;
         a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
    //     printhello();
    //    System.out.println(sum(2,4)); //arguments
        int a=5;int b=6;
        sum(a,b);
        System.out.println("a is "+a);
        System.out.println("b is "+b);

       
}
}
