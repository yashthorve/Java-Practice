
import java.util.*;
class BintoDec{

// public static int BintoDec(int bin){
//     int pow=0;
//     int dec=0;
//     while(bin>0){
//         int lastdig=bin%10;
//         dec=dec+(lastdig*(int)Math.pow(2,pow));
//         bin=bin/10;
//         pow++;

//     }
//     return dec;
// }
public static int DectoBin(int dec){
    int pow=0;
    int bin=0;
    while(dec>0){
        int rem=dec%2;
        bin=bin+(rem*(int)Math.pow(10,pow));
        dec=dec/2;
        pow++;

    }
    return bin;
}
    public static void main(String args[]){
        // int n = 101;
        int p=11;
        System.out.println(DectoBin(p));
        }


 }