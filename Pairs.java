public class Pairs{


    public static void Pairs(int arr[]){
        int tp=0;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr=arr[i];
            
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("  +curr+ "," +arr[j]+")");
                tp++;
            }
            System.out.println();
        }
       System.out.println("Total no of pairs are :" +tp);
    }
    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7};
        Pairs(arr);
        
    }


}