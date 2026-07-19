
import java.util.*;
public class Arrays {


    public static int LinearSearch(int marks[],int key){
   
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
                
            }
             
        }
        return -1;
    }
    public static void main(String args[])
    {
        int marks[]={2,3,4,5,6,7,9,22};
        int key=60;
        if(LinearSearch(marks, key)==-1){
            System.out.println("Key is not  present on any index ");
        }else{
              System.out.println("Key is present on index "+LinearSearch(marks, key));
        }
      
     }
}

