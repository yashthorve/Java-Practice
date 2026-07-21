import java.util.*;
class TrapRainWater{


    public static int Trap(int arr[]){
       
        //Trapper water= min(left max ,right max)-height of current bar ,then add trapped water of each bar .
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
         for(int i=1;i<arr.length;i++){
                leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }  
        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];

                            
          for(int i=arr.length-2;i>=0;i--){
           rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int trappedwater=0;

        for(int i=0;i<arr.length;i++){

            //waterlevel=min(leftmax bound,rightmax bound)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trappedwater=waterlevel-height[i]
            trappedwater+=waterlevel-arr[i];;
        }
        return trappedwater;

    }


public static void main(String[] args) {
    int arr[]={4,2,0,6,3,2,5};
    System.out.println(Trap(arr));





}

}