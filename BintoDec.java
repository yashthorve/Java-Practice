
import java.util.*;
class BintoDec{

public static int BintoDec(int bin){
    int pow=0;
    int dec=0;
    while(bin>0){
        int lastdig=bin%10;
        dec=dec+(lastdig*(int)Math.pow(2,pow));
        bin=bin/10;
        pow++;

    }
    return dec;
}
    public static void main(String args[]){
        int n = 101;
        System.out.println(BintoDec(n));
        }


 }