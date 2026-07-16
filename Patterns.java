public class Patterns {
    public static void main(String[] args) {
// * 
// **
// ***
// ****
// *****
// ******
// *******
// ********
// *********
// **********
            // for(int line=1;line<=10;line++){

            //     for(int star=1;star<=line;star++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // int n=7; //number of lines
            // for(int line=1;line<=n;line++){
            //     for(int star=1;star<=n-line+1;star++){
            //         System.out.print("*");

            //          }
            //          System.out.println();
            // }
// ****
// ***
// **
// *


// 1
// 12
// 123
// 1234
        // int n=4;
        // for(int line=1;line<=n;line++){
        //     for(int num=1;num<=line;num++){
        //          System.out.print(num);
        //     }
        //     System.out.println();
        // }
          int n=4;
          char ch='A';
        for(int line=1;line<=n;line++){
            for(int chars =1;chars<=line;chars++){
                 System.out.print(ch);
                 ch++;
            }
            System.out.println();
        }




    }
}