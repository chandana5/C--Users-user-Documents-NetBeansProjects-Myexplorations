
public class Pattern1 {
	public static void main(String[] args) {
		
			for(int j=1 ; j<=5  ;j++)
			{
				for(int s=5;s>j;s--)
				{
					System.out.print(" ");
				}
					
				for(int i=1;i<=j &&  j%2==1;i++)
				{ 
				System.out.print("*");
			}
		System.out.println();	
		}
	}

}
