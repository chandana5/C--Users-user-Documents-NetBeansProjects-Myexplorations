package PROG2_Muppalla_Chandana;
/*1. We can find the given target in between any two numbers in sorted array in less time complexity by binary search
 * 2. Initially we need to decide a pivot and start and end elements and  pivot is start+end/2
 * 3.If the given target is less than the taken pivot change the last elements index 
 * 4. If the given target is greater than  pivot change the start 
 * 5.Eventually changes the pivot until the start and end elements cross each other (That's how we eliminate half of the the array elements every time) and that's how we find the position of the element
 * 
 * */
public class FindingTarget {
	
	public static int FindPosition (int[]arr, int target )
	{
		int mid=0;
		int start=0;
		int last=arr.length-1;
		while ((start<=last))
		{  mid=(start+last)/(2);
			if(target<arr[mid])
			{ 
				last=mid-1;//since it is less than the mid so the last has to be updated to mid-1
				
			}
			else if(target >arr[mid])
			{
				
			start=mid+1;//since the target is greater than the mid the start has to be updated to pivot+1
			mid=mid+1;
			
			}
		}
		
		return mid;
		
	}

	
	public static void main(String args[])
	{
	int [] arr={3,5,7,9,18,21,45,96,99};
		
		System.out.println(FindPosition(arr,4));
	}
}
