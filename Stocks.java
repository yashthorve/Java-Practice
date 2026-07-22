public class Stocks{
    public static int Stocks(int arr[]){
        int Buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        int n=arr.length;
        for(int i=0;i<n;i++){
        if(Buyprice<arr[i]){//todays price is higher than the buying price,
        // so we will and make a profit
        int profit=arr[i]-Buyprice;
        maxProfit=Math.max(maxProfit, profit);
        }else{
            //todays price is lower ,so if we sell it will be loss
            //so we just buy the stock today ,as its lowest buying price
            Buyprice=arr[i];
        }
 }
        return maxProfit;
        
        }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(Stocks(prices));

    }
}