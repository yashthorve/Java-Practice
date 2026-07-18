
import java.util.*;
public class Practice1 {
    //average of 3 numbers

    // public static int avg(int a, int b, int c){
      
    //     int n=a+b+c;
    //     return (int)(n/3.0);
    // }

    // public static boolean isEven(int n) {
    //     if(n%2==0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // public static int reverse(int n)
    // {
    //     int pal=n;
    //     int rev=0;
    
    //     while(pal!=0){
    //     int ld=pal%10;       
    //      rev=rev*10+ld;
    //      pal=pal/10;


    //     }

     
    //     return rev;

    // }

   
    // public static boolean palindrome(int n){
    //     if(n==reverse(n)){
    //         return true;
    //     }
    //     return false;
    // }
    public static int sum (int num){
    int number=num;

    int sum=0;
    while(number!=0){ //23
        int ld=number%10;
        sum=sum+ld;
        number=number/10;
    }
    return sum;
}
    public static void main(String[] args) {
        //   int a=3,b=4,c=5;
        // System.out.println("Average: " + avg(a,b,c));
        // System.out.println("Is 4 even? " + isEven(4));
        // System.out.println("Is 5 even? " + isEven(5));
        // System.out.println(palindrome(202));
        // System.out.println(Math.min(4,5));
        // System.out.println(Math.max(4,5));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.abs(-4));
        // System.out.println(Math.pow(2,3));
            System.out.println(sum(756));
        

    }

}
