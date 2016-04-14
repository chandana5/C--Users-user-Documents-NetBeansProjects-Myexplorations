package Practice;

public class Steps {

	public static int dyanamic(int n)
	{
		int[]ar=new int[n];
		ar[0]=1;
		ar[1]=2;
		ar[2]=ar[0]+ar[1];
		ar[3]=ar[1]+ar[2];
		
		
		
		if(n<=1)
		{
			return ar[n-1];
		}
		
		
		for(int i=4;i<n;i++)
		{

			ar[n-1]=ar[i-1]+ar[i-2]+ar[i-3]+ar[i-4];
			
		}
		
		
		
	return ar[n-1];
		
	}
	
		public static int r(int n,int m)
		{
			
			if(n==1||n==2)
			{
				
				return n ;
			}
			 
			
			else
			{	
			System.out.println(n);
			
			}	return r(n-1,m)+ r(n-2,m)+r(n-3,m) ;
			
		}
		
		
	 
		public static void main(String args[])
		{
			
		System.out.println(r(4,3));
	System.out.println(dyanamic(4));	
		}
	}



