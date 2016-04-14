package PROG2_Muppalla_Chandana;

/* 1.Idea is to partition the array based on Random pivot and  quick sort it.( quick select algorithm)
 * 2.Selecting pivot.. pivot can be anything we have chosen a random number that is being generated in between the length of the given array for that we have used a random function 
 * 3.Since to eliminate the worst case in quick sort we have used randomized pivot
 * 4. We will continue the partition process until  we find the number (passed index) matches the pivot then we will return the pivot ..if not partition happens
 * 5.To keep track use start --0,,end-- arr.length-1,pivot--- randomized number in between start and end
 * */


import java.util.Random;

public class KlargestElement {
	
	public static int findkthlargest(int[]arr, int k){
		 
		 return sort(arr, 0, arr.length - 1, k - 1);//given starting element,ending element,given index -1
	
	}
	
	public static  int sort(int[] arr, int start, int end, int k) {
		  if (start <= end) {
		    int pivot = partition(arr, start, end);
		    if (pivot == k) {//checking if that is given index value actually( given number -1)
		      return arr[k];
		    }
		    if (pivot > k) {// if  returned pivot is greater than give value then it has to be partitioned
		      return sort(arr, start, pivot - 1, k);// sending change in end position
		    }
		    return sort(arr, pivot + 1, end, k);//else condition so change in start position
		  }
		  return Integer.MIN_VALUE;
		}
		 
	public  static int partition(int[] arr, int start, int end) {//partition process
		  int pivot = start + new Random().nextInt(end - start + 1); //getting a pivot value
		  
		  swap(arr, end, pivot);
		  for (int i = start; i < end; i++) {//based on pivot partition it the elements less than that are placed left of the pivot value and elements greater than those are placed after that pivot value
		    if (arr[i] > arr[end]) {
		      swap(arr, i, start);//if comparision val is greater swap it and increment the start value
		      start++;
		    }
		  }
		  swap(arr, start, end);//to place the pivot in the exact position
		  return start;
		}
		 
		public static void swap(int[] arr, int start, int end) {//swapping using temperory variable
		  int tmp = arr[start];
		  arr[start] = arr[end];
		  arr[end] = tmp;
		}
		

	
public static void main (String args[])
{
	int[]arr={3,6,2,1,9};
	
	System.out.println( findkthlargest(arr,5));// Sending the array and 
}
}
