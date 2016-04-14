package Practice;

public class UniquePath {
	
	public  static long getUnique(int m, int n)
	
	{

	if(m==1 ||n==1)
	{
		return 1;
	}
	
	else if(m==0 ||n==0)
	return 0;
	long x=0;

		x= getUnique(m-1,n)+getUnique(m,n-1);
		
		return x;

	}
	
	public static int dynamicUniquepath(int m, int n)
	{
		int path[][]=new int[m][n];
		if(m==0 && n==0)
		{
			return 0;
		}

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0 ||j==0)
				{
					path[i][j]=1;
				}
				else if(i!=0 && j!=0)
				{
					path[i][j]=((path[i-1][j])+(path[i][j-1]));
					
				}
				
			
			}
		}
		
		
		
		return path[m-1][n-1];
	}
	
	public static void main(String args[])
	{
		System.out.println(getUnique(3,3));
		System.out.println(dynamicUniquepath(3,3));
	}
}
