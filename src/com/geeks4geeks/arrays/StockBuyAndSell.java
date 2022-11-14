package com.geeks4geeks.arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {


	//We know prices of a stock for upcoming n days
	//We can buy the stock on any day and sell in any upcoming days
	//Goal is to maximize the profit
	//Prices are sorted in decreasing order, NO PROFIT
	//Prices are sorted in increasing order, buy it on first day and sell it on last day to maximize profit
	
		
	int arr[]={1,5,3,8,12};
	int profit=StockBuySell_Naive(arr, 0,arr.length-1);
	System.out.println(profit);
	
	profit=StockBuySell_Efficient(arr, arr.length);
	System.out.println(profit);
	}
	
	
	public static int StockBuySell_Efficient(int[] price, int n) {
		
		//Buy a stock when prices are going down and reach a bottom point
		//Sell a stock when prices are going up and reach a peak point
		//Find bottom points and peak points
		//At every bottom point, buy the stock. At every peak point, sell the stock
		
		int profit=0;
		for(int i=1; i<n; i++){
			if(price[i] > price[i-1]){
				profit=profit+(price[i] - price[i-1]);
			}
			
		}
		
		
		
		return profit;
	}


	//Recursive Solution
	//Consider all such pairs where i < j and arr[j] > arr[i], find the profit and then calculate the maximum of all such profits
	public static int StockBuySell_Naive(int[] price, int start, int end) {
		
		//Base Case
		if(end<=start)
			return 0;
		
		int profit=0;
		for(int i=start; i<end; i++){     //loop from start till end-1
			for(int j=i+1; j<=end; j++){  //loop from i+1 till end
				if(price[j] > price[i]){
					int curr_profit=price[j] - price[i]+ StockBuySell_Naive(price,start,i-1) + StockBuySell_Naive(price,j+1,end);
					profit=Math.max(curr_profit, profit);				}
			}
		}
		
		
		
		return profit;
	}

}
