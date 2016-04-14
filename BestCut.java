package Practice;

import java.util.ArrayList;

public class BestCut {

	public static int Cut(int n)
	{

	
		int[]price={1,5,8,9,10,17,17,20};
		if(n==1)
		{
			//return price[0];
			return 1;
		}
		if(n==0)
		{
			return 0;
		}
		 int max_val = 0;
		for(int i=1;i<n+1;i++)
		{
		
	  max_val=Math.max(max_val,price[i-1]+Cut((n-i)))  ;	
	
		}
		
		return  max_val;
	
	}
	
	public static int dynamicpgm(int n)
	{	int[]price={1,5,8,9,10,17,17,20};
		 int val[]=new int[n+1];
		   val[0] = 0;
		   int i, j;
		 
		   // Build the table val[] in bottom up manner and return the last entry
		   // from the table
		   for (i = 1; i<=n; i++)
		   {
		       int max_val = 0;
		       for (j = 0; j < i; j++)
		         max_val =Math.max(max_val, price[j] + val[i-j-1]);
		       val[i] = max_val;
		   }
		 
		   return val[n];
	}
	
	public static void main(String args[])
	{
		int m=8;
		
     System.out.println((Cut(8)));
	//System.out.println(dynamicpgm(8));
		
}
}



