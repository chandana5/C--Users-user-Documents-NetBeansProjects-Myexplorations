package Practice;

public class ClimbingStairs {
	
	
	public static long getSteps(int n)
	{
		
		if(n==1||n==2)
		{
			return n;
		}
		if(n==3)
		{
			return 4;
		}
		if(n==4)
		{
			return 8;
		}
		else
			return getSteps(n-1)+getSteps(n-2)+getSteps(n-3)+getSteps(n-4);
		
	}
	public static long dynamic(int n)
	{
		long[] storedarray=new long[n];
		
		if(storedarray[0]==0)
		{
		storedarray[0]=1;
		storedarray[1]=2;
		storedarray[2]=4;
		storedarray[3]=8;
		}
		
		for(int i=4;i<n;i++)
		{
		
			storedarray[i]=storedarray[i-1]+storedarray[i-2]+storedarray[i-3]+storedarray[i-4];
			
		}
		
		return storedarray[n-1];
	}
	public static void main(String args[])
	{
		System.out.println(getSteps(4));
		System.out.println (dynamic(10));
		
		
	}

}
