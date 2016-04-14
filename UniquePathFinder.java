package Practice;

import java.util.ArrayList;

public class UniquePathFinder {
	public static int robotPaths(int down, int right, String path)
	{
	    path = path+ down +","+ right +"  ";
	    if(down==1 && right==1)
	    {
	        System.out.println(path);
	        return 1;
	    }

	    int counter = 0;

	    if(down==1)
	        counter = robotPaths(down, right-1, path);
	    else if(right==1)
	        counter = robotPaths(down-1, right, path);
	    else
	        counter = robotPaths(down, right-1, path) + robotPaths(down-1, right, path);

	    return counter;
	}

	
	public static void main(String args[])
	{
		 String pathList="";
		
		int down=3;
		int right=3;
		
		
		robotPaths(down,right,"");
	}
}

