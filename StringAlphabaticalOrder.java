package Practice;

public class StringAlphabaticalOrder {
	public static void main(String[] args) {
		String s="chandana";
		String res="";
		String finaresl="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				
				
				if(s.charAt(i)==s.charAt(j))
				{
					//res=res.concat(s.charAt(i));
						
				}
				else if(s.charAt(i)!=s.charAt(j))
				{
					res=res.concat(s.substring(i, j));
				}
				
				
			}
				
			
		}
		
		System.out.println(res);	
	}

}
