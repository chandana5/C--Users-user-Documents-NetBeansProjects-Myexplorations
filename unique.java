import java.util.ArrayList;

public class unique {
public static void main(String args[])
{
	ArrayList<String> m=new ArrayList<String>();
	String a="SBBDDCCEEG";
	
	for(int i=0;i<a.length()-1;i++)
	{
		
			m.add(a.substring(i,i+1));	
		
		
		
	}
	for(int i=0;i<m.size();i++)
	System.out.println(m.get(i));
}
}
