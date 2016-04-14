package PROG3_Muppalla_Chandana;
/*We can solve this by using recursion assume that we  start at 1,1 position and we need to reach the bottom right corner
 * we can either go to right or down that is the  base condition would be if we are at one grid less than the destination either from top or left for example if we wan to go to 2,2 position 1,2 or 2,1 are the grids from which we are one step far from destination 
 * 3. We need to notice that we if are at corner columns or edge rows we have only possible step to move either right or down so we know we have only way of proceeding
 * 4. For Remaining steps we need know [row-1,col] and [row,col-1* grids values to know the number ways to reach[row][col] grid  */ 
public class UniquePath {
	
	public  static long getUnique(int m, int n)
	
	{
		if(m==0 ||n==0)//no steps 
			return 0;

		else if(m==1  && n==1)// no steps since we start at 1,1
	
		return 0;
	
		else if(m==1  || n==1)// that is at right most column or top most row
		
			return 1;
		
	
		return getUnique(m-1,n)+getUnique(m,n-1);//recursion formula

	}
	
	
	
	public static void main(String args[])
	{
		System.out.println(getUnique(3,3));
		
	}
}
