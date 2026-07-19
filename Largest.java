import java.util.*;
public class Largest{

    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            } if(smallest>arr[i]){
                    smallest=arr[i];

            }
        }
        System.out.println("Smallest is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={23,35,54,57,68};
        System.out.println("largest number is: "+largest(arr));
    }
}
