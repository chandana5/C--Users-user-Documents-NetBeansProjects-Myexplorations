package PROG3_Muppalla_Chandana;
/*To Find out  the paths of robot
 * 1.We need to sub divide like if we reach the rigth most column we have only down movement and at that time move only down part by using recursion
 * 2. Similarly if we at down most row we have only right is the option for us to move ..
 * 3.or else if are other than the above condition we can move either right or down  every time we call function recursively at that time we will store the path in an String based on returning values from the function m,n values are being concated to the String
 * 
 *    4.Since We assume that we  start at 1,1 grid that is the base condition  at that point our string path got all paths..attached in a sequence 
 *    
 *    5.For instance take 3,3 as destination we will go to else condition and every time we call function  at that time we add ever step we move to that path and then eventually we reach either m=1 or n=1 condition and then add those grid position to path
 *    
 *     6. Finally we reach base condition where m=1 and n=1 .. There we got every path we moved in the String.. Since my recursive function calls from back my path sequence is reversed  So I call the loop from reverse  and printed*/

import java.util.ArrayList;

public class UniquePathFinder {
	public static int robotPaths(int m, int n, String path)
	{
	    path = path+")"+m +","+ n  +"("+" >-";
	    
	    if(m==1 && n==1)
	    {
	        for(int i=path.length()-5;i>=0;i--)
	        {
	        	
	        	
	        	if(path.charAt(i)=='1' && path.charAt(i-2)=='1')// inorder to divide the paths checked the intial condition path
	        	{
	        		
	        		
	        		System.out.println();//new line difference
	        		System.out.print("(");
	        	}
	        
		        	System.out.print(path.charAt(i));
		        	
	        }
	        return 0;
	    }

	    int retval = 0;

	    if(m==1)
	    	retval = robotPaths(m, n-1, path);//
	    else if(n==1)
	    	retval = robotPaths(m-1, n, path);
	    else
	    	retval = robotPaths(m, n-1, path) + robotPaths(m-1, n, path);

	    return retval;
	}

	
	public static void main(String args[])
	{
		
		
		int m=2;
		int n=2;
		
		
		robotPaths(m,n,"");//passed an empty string and grid destination position
	}
}

