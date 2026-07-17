import java.util.*;

public class LiveRec1 {
    public static void main(String[] args) {
        // for(int i=2;i%3!=0 &&i%5!=0;i++)
        // {
        //     System.out.println(i);
        // }

        //sum of odd and even numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                sumEven+=num;
            }else{
                sumOdd+=num;
            }
        }
        System.out.println("Sum of Even:"+sumEven);
        System.out.println("Sum of Odd:"+sumOdd);
    }
}
