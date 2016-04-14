 package Practice;

public class FindingPosition {
	public static int FindPosition (int[]arr, int target )
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			 if(target<arr[i])
				{
					return i;
				}
			
			if(target>arr[i] && target<arr[i+1])
			{
				return i+1;
			}
			
			
			if(target>arr[arr.length-1])
				return arr.length;
		}
		
		return arr.length;
	}
	
	
	
	public static void main(String args[])
	{
		int [] arr={3,5,7,9,18,21,45,96};
		
		System.out.println(FindPosition(arr,42));
	}

}
