package package_static;

public class StaticBlock {
    StaticBlock(){
    System.out.println("Constructor is invoked");
}
static{
    System.out.println("static block is invoked");
    }
    {
        System.out.println("non-static block is invoked");
    }
    public static void main(String[] args) {
        System.out.println("Hello main");
    
        StaticBlock obj= new StaticBlock();
        
    }


static{
    System.out.println("static block is invoked #2");
}

}
