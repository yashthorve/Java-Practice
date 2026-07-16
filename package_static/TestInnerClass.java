package package_static;

 class OuterClass
    {
       static int data1=40;
        static class Inner{
            void show(){
                System.out.println( "data1 is "+data1);
            }
        }
    }
    public class TestInnerClass {
        public static void main(String[] args){
            OuterClass.Inner obj=new OuterClass.Inner();
            obj.show();
           System.out.println("data1 "+OuterClass.data1);
         

        }

    
}
