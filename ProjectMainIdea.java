package Project;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;

public class ProjectMainIdea {
	
	public  static void main(String args[]) throws FileNotFoundException
	{
		File in=new File("C:/Users/user/Desktop/input_data_set/input/input_00.txt");
		
		BufferedReader input = new BufferedReader(new FileReader(in)); 
		String line;
		
		    try {
		    	long    Starttime=	System.currentTimeMillis();
		    	ArrayList<String>onefile =new ArrayList<String>();
	
				while ((line = input.readLine()) != null)    
				{
				String[]	words=  line.split(" ");
				for(int i=0;i<words.length;i++)
				{
					String temp= new String("");
					for(int j=0;j<words[i].length();j++)
					{
						
						if(words[i].charAt(j)==('.')||words[i].charAt(j)==(',')|| words[i].charAt(j)==('"')||words[i].charAt(j)==('?')|| words[i].charAt(j)==('\''))
						{
						
						}
						else
			temp=temp.concat(words[i].substring(j, j+1));
						
					}
					onefile.add(temp);
					
				}
				long    Stoptime=	System.currentTimeMillis();
				
				System.out.println( Stoptime-Starttime);
				
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		File out=new File("output.txt");
		
		
	}

}
