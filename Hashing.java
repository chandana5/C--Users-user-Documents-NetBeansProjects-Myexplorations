package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class Hashing {
	
	
	public static int[] findindex(int[] unsort,int target)
	{
		int[]res={-1,-1};
		HashMap m=new HashMap(); 
		
		for(int i=0;i<unsort.length;i++)
		{
		m.put(target-unsort[i],i);
		}
	for(int i=0;i<unsort.length;i++)
	{
		if(m.containsKey(unsort[i]))
		{
			
	   res[0]=target-i;
	   res[1]=i;
		
		}
		
		
	}

	return res;
	}
	
	
	public static void main(String[] args) {
		
		int[] unsort={1,9,0,3,6,12};
		int target=6;
	int[]res=findindex(unsort,target);	
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
	
	}

}
