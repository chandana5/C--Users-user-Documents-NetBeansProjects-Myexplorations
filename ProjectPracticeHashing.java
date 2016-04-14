package Practice;

import java.util.HashMap;

public class ProjectPracticeHashing {

	public static void main(String args[])
	{
		String input="ababcdac";
		int indexdesign=1;
		HashMap hm =new HashMap();


		for(int i=0;i<input.length();i++)
		{
			int asci=(int)input.charAt(i);
			System.out.println(asci);
		}

		for(int i=0;i<input.length();i++)
		{

			if( hm!=null && hm.containsKey(input.charAt(i)))
			{
				hm.replace(input.charAt(i), indexdesign+1);

			}
			else
				hm.put(input.charAt(i), indexdesign);
		}



	}
}


