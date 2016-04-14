package PROG2_Muppalla_Chandana;
/*1.finding out the smallest to do it in constant space..that too in a circular shift array.
 * 2.in circular shift we need to  see the pattern that is if   it is shifted  at  particular position, every time there is first element of array is greater than the last element
 * 3.   By checking there is change in increment sequence that is we might come across a number that is less than the previous that is the smallest number
 * 4. Time complexity is we need traverse the array at least once so O(n) and space is of constant tim O(1)
 * 
 */
public class FindingSmallest {
	
	public static int findsmallest(int[]arr)
	{
		
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>arr[i+1])// checking the number is less
			{
				result=arr[i+1];
				return result;
			}
			
		}
		return result;
	}

	
	public static void main(String args[])
	{
		int[]arr={5,9,18,20,3,4};
		System.out.println(findsmallest(arr));
		
	}
}
