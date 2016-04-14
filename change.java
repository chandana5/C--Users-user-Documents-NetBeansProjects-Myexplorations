package Practice;

public class change {

	
	public static int changereturn(int n,int[]ways)
	{
	int[] res=new int[n];
	
	if(res[0]==0)
	{
	res[0]=n-ways[0];
	res[1]=n-ways[1];
	res[2]=n-ways[2];
	}
	
	
		for(int i=0;i<res.length;i++)
		{
			
		}
		
			
		return 0;
		
	}
	
	public static void main(String args)
	{
		
		int[]ways={5,2,1};
	
		
		System.out.println(changereturn(6, ways));
	}
}
