public class Subarray {
    public static void Subarray(int nums[]){
                int ts=0;
                int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start=i;
        for(int j=i;j<nums.length;j++){
            int end=j;
            int sum=0;
        for(int k=start;k<=end;k++){
            System.out.print(nums[k]+" ");
            sum+=nums[k];
           
        }
          if(max<sum){
            max=sum;
          }
          ts++;
        System.out.println();

    }
    System.out.println();

}
    System.out.println("Total no of Subarrays :"+ts);
     System.out.println("Max sum of subarrays :"+max);
    }
    
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        Subarray(nums);


    }
}
