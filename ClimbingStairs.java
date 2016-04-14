package PROG3_Muppalla_Chandana;
/*1.We can solve this program by recursion or by dynamic programming
 * 2.We can either climb steps by taking single step.2.. or 3.. or 4 
 * 3. For these kind of problems we need to know the base conditions that is for 1 ,2, 3,4 
 * 4. To solve climbing nth stair, we must know previous four steps to calculate 5 we must know  number of ways to climb 4,3,2,1 steps  
 * thus by adding all those values we can get number of ways to climb  nth stair 
 * So, We need to call recursively the given function to get those values by reducing the function to n-1..n-2..n-3..n-4
 * */
public class ClimbingStairs {
	
	
	public static long getSteps(int n)
	{
		
		if(n==1||n==2||n==0)
		{
			return n;//base conditions for 0 steps =0..1 step we have only one way for two steps we can go 1,1..or directly 2 steps ,so 2 ways
		}
		if(n==3)
		{
			return 4;//1,1,1....2,1..1,2...3
		}
		if(n==4)
		{
			return 8;
		}
		else
			return getSteps(n-1)+getSteps(n-2)+getSteps(n-3)+getSteps(n-4);//recursion formula
		
	}
	public static long dynamic(int n)
	{
		long[] storedarray=new long[n];
		
		if(storedarray[0]==0)
		{
		storedarray[0]=1;//must know the base values and store them in a array
		storedarray[1]=2;
		storedarray[2]=4;
		storedarray[3]=8;
		}
		
		for(int i=4;i<n;i++)
		{
		
			storedarray[i]=storedarray[i-1]+storedarray[i-2]+storedarray[i-3]+storedarray[i-4];//then add previous four values for ith value
			
		}
		
		return storedarray[n-1];
	}
	public static void main(String args[])
	{
		System.out.println(getSteps(5));
		System.out.println (dynamic(10));
		
		
	}

}
