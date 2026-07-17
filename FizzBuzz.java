import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count3=0;
        int count5=0;
        for (int i=1;i<=n;i++){
            count3++;
            count5++;
            if(count3!=3 && count5!=5){
                System.out.print(i+ " ");
            } else  if(count3==3){
                    System.out.print("Fizz ");
                    count3=0;
            } if(count5==5){
                  System.out.print("Buzz ");
                  count5=0;
            }
        }
        // for(int i=0;i<n;i++){
        //     int num=sc.nextInt();
        //    if(num%3==0 && num%5==0){
        //         System.err.println("FizzBuzz");
        //     }else if(num%5==0){
        //         System.out.println("Buzz");
        //     }else if(num%3==0){
        //         System.out.println("Fizz");
        //     }
        //     else{
        //         System.out.println(num);
        //     }
        // }

    }
}

