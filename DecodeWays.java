package Practice;

import java.util.HashMap;

public class DecodeWays {
	
	public static int decode(int n,String s,HashMap decodeways)
	{int res=0;
		
		if(n==1)
		{
		return	1;
		}
for(int i=0;i<n;i++)
{
	res=res+decode(n-i,s,decodeways);
}
return res; 
	}

	
	public static void main(String args[])
	{
		String s="12";
		int n=s.length();
	
		HashMap decodehash=new HashMap();
		decodehash.put("A", 1);
		decodehash.put("B", 2);
		decodehash.put("C", 3);
		decodehash.put("D", 4);
		decodehash.put("E", 5);
		decodehash.put("F", 6);
		decodehash.put("G", 7);
		decodehash.put("H", 8);
		decodehash.put("I", 9);
		decodehash.put("J", 10);
		
		decodehash.put("K", 11);
		decodehash.put("L", 12);
		decodehash.put("M", 13);
		decodehash.put("N", 14);
		decodehash.put("O", 15);
		decodehash.put("P", 16);
		decodehash.put("Q", 17);
		decodehash.put("R", 18);
		decodehash.put("S", 19);
		decodehash.put("T", 20);
		decodehash.put("U", 21);
		decodehash.put("V", 22);
		decodehash.put("W", 23);
		decodehash.put("X", 24);
		decodehash.put("Y", 25);
		decodehash.put("Z", 26);
		decode(n,s,decodehash);
	}
}
