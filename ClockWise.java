/*1.Taking n as the size and t=retrieving values until square of n
 * 2. To get a clock wise matrix when we reach the end of the column of the matrix decrementing the top and incrementing top and then after reaching the end of both rows and columns 
 * traverse to the left end of the end matrix .
 * 3.Then reaching left end then again traverse up by incrementing the top  until previous top-1 
 * 4. similarly changing the values of left and right once reaching their maximum and minimum values change the direction
 * 
 * */

import java.util.*;
public class ClockWise {
	
	public static int[][] constructMatrix(int n)
	{
	
		
		int[][] normalMatrix=new int[n][n];// took a sample 2 d matrix.
		int left = 0;   //left most column index
		int top = 0;    // top most row index
		int right = n;    // right most column index
		int bottom = n;      // bottom most row index
		int count=1;
	int j=1;
		
		
		{
		
			while(left < right && top < bottom)// this gives the right increment and left decrement
			{
				if(count>n)
				{
					count=n;
				}
				
				for (int i = left;  i < right && j<=n*count; i++,j++)
				{
					normalMatrix[top][i]=j;
			
				}
				
				count++;
				
							
				top ++;  //increase top most row index
				
				if(top >= bottom)
					break;
				
				
				for (int i = top;j<=n*count&& i < bottom; i++,j++)// this gives the top decrement and bottom increment
				{
					normalMatrix[i][right-1]=j;
					
					
				}
				
				count++;
			
						
				right --;
				
				if(left >= right) // decrease the right most column index
					break;
				
			
				for (int i = right-1;  j<=n*count && i >= left; i--,j++)// this gives the left increment and right decrement
				{
					normalMatrix[bottom-1][i]=j;
				
				}
				
				count++;
			
						
				bottom--;
				
				if(top >= bottom) // decrease the bottom most row index
					break;
				
					
				for (int i = bottom-1; j<=n*count && i >= top; i--,j++)//increasing top and decreasing bottom
				{
					normalMatrix[i][left]=j;
					
				}
				
				count++;
						
				left ++;          // increase the left most column index
			}
			
		}
		
		return normalMatrix;
		}
		
		
	
		
	
	
	
}
