import java.util.*;
public class BinarySearch {

        public static int BinarySearch(int arr[],int key){
            int start=0,end=arr.length-1;
            while(start<=end){ 
                int mid=(start+end)/2;
                if(arr[mid]==key){
                    return mid; //element found
                }if(arr[mid]<key) //then update start ( 2 nd half)
                {
                    start=mid+1;
             }if(arr[mid]>key){ //update end (search in 1 st half)
                    end=mid-1;
             }
            }
               
            return -1;
        }
        
    public static void main(String[] args) {
        int arr[]={12,15,18,19,22,26,78};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        System.out.println("Number is present on index :"+BinarySearch(arr,key) );
    }
}
