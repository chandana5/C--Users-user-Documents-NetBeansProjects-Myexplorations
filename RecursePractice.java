package Practice;

public class RecursePractice {
	public static int  p(int n)
	{
		
		if(n==1||n==2)
		{
			System.out.println("base case"+ n);
			return n;
		}
		
		else
		{	
		System.out.println(n);
		int x=p(n-2);
		System.out.println("x value"+x);
		int y=p(n-1);
		System.out.println("y value"+y);
		
		return x+y;
		
		}
		
		
	}
	
	public static void main(String ar[])
	{
		System.out.println(p( 4));
	}

}
