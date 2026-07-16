import java.util.*;

class Loops{
    public static void main(String[] args){
        // int i = 0;
        // while(i <= 10){
        //     System.out.println(i);
        //     i++;
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum=0;
        // int i=1;
        // while(i<=n){
        //         sum+=i;
        //         i++;
        // }
        // System.out.println(sum);
        // for(int i=1;i<=4;i++){
        //     System.out.println("****");
        // }

        // }
        // int n=sc.nextInt();
                                            //note this
        // while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n=n/10;
        // }
//         int n=10899;
//         int rev=0;
        
//         while(n>0){
//                                              //note it 
//              int lastdigit = n%10;
//             rev=rev*10+lastdigit;
//             n=n/10;
//         }
//         
        
//         System.out.println(rev);

//check if a number is prime or not                                 note it 
            int n=sc.nextInt();
            int i;
            if(n==2){
                System.out.println("Prime");
            }else{
          boolean isPrime=true;
            for(i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
    }
}

}