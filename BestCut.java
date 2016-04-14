package PROG3_Muppalla_Chandana;
/*In order to solve this problem we can use recursion
 * 1.The basic idea is we can cut 8 inches log in to many ways.. For example if we take 4 inches we can make 1,1,1,1..2,2..2,1,1..3,1,,4 these are the number ways we cut the log  so if we cut i inch and add those price we are left with n-i inches  and those prices of log to be cut this has to to be done for every inch that is for every i
 * 2. The base condition would be length the wooden log be zero n more to cut if we are left with 1 inch return the price of inch one
 * 4. Out of all those logs we need to have maximum price of all possible cuts thus we find out the maximum of the recursive function that constantly added with corresponding price value*/



public class BestCut {

	public static int Cut(int n,int[]price)
	{

		if(n==1)
		{
			return price[0];//if price of 1 inch is 1 we can return 1
			//return 1;
		}
		if(n==0)
		{
			return 0;//base condition
		}
		 int max_val = 0;//maxmium value is being updated
		for(int i=1;i<n+1;i++)
		{
		
	  max_val=Math.max(max_val,price[i-1]+Cut((n-i),price))  ;	//comparision of previous maximum value and current log cut prices and finding the maxmium out of it .
	
		}
		
		return  max_val;
	
	}
	
	
	public static void main(String args[])
	{
		
		int[]price={1,5,8,9,10,17,17,20};
		int m=price.length;
		
     System.out.println((Cut(m,price)));
	
		
}
}



