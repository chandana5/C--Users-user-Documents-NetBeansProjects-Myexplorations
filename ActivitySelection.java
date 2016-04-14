package Practice;

import java.util.ArrayList;

public class ActivitySelection {
	public static void main(String args[]){
		ArrayList<String>sortinput=new ArrayList<String>();
		ArrayList<Integer>start=new ArrayList<Integer>();
		ArrayList<Integer>end=new ArrayList<Integer>();
		ArrayList<String>order=new ArrayList<String>();
		ArrayList<Integer>distance=new ArrayList<Integer>();
		ArrayList<String>compare1=new ArrayList<String>();
		ArrayList<String>compare2=new ArrayList<String>();
		int n;
		
		start.add(1);
		start.add(3);
		start.add(0);
		start.add(5);
		start.add(3);
		start.add(5);
		start.add(6);
		start.add(8);
		start.add(8);
		start.add(2);
		start.add(12);
		end.add(4);
		distance.add(end.get(0));
		end.add(5);
		end.add(6);
		end.add(7);
		end.add(9);
		end.add(9);
		end.add(10);
		end.add(11);
		end.add(12);
		end.add(14);
		end.add(16);
		
		sortinput.add("1");
		order.add("1");
		sortinput.add("2");
		sortinput.add("3");
		sortinput.add("4");
		sortinput.add("5");
		sortinput.add("6");
		sortinput.add("7");
		sortinput.add("8");
		sortinput.add("9");
		sortinput.add("10");
		sortinput.add("11");
	int k=0;
		
		for(int i=0;i<start.size();i++)
		{
			for(int j=k;j<end.size();j++)
			{
			
				if(start.get(i)>=end.get(j))
				{
					
					System.out.println(sortinput.get(i)+" "+end.get(i));
					order.add(sortinput.get(i));
					distance.add(end.get(i));
					
					k=i;
					break;
					
				}
				
			}
		}
		if(distance.size()%2==0)
		{
		n=	distance.size()/2;
		
		}
		else
			
			n=(distance.size()+1)/2;
			
		
		
		//start.get(distance.get(n));
		
		for(int j=0;j<end.size();j++)
		{
		
			if(start.get(8)>=end.get(j))
			{
		System.out.println(" values"+sortinput.get(j));
		compare1.add(sortinput.get(j));
			}
	//int max=	(distance.get(n)-distance.get(0))+ (distance.get(distance.size()-1)- distance.get(n)) +1;
		
		//System.out.println(max);
	}
	
		
		for(int j=0;j<end.size();j++)
		{
		
			if(start.get(8)<=end.get(j))
			{
		System.out.println(" values1"+sortinput.get(j));
		compare2.add(sortinput.get(j));
			}
	//int max=	(distance.get(n)-distance.get(0))+ (distance.get(distance.size()-1)- distance.get(n)) +1;
		
		//System.out.println(max);
	}
		int Count=0;
		for(int i=0;i<compare1.size();i++)
		{
			for(int j=0;j<order.size();j++)
			{
				if(compare1.get(i).equals(order.get(j)))
				{
				Count=Count+1;	
				System.out.println(order.get(j));
				}
			}
		}
		for(int i=0;i<compare2.size();i++)
		{
			for(int j=0;j<order.size();j++)
			{
				if(compare2.get(i).equals(order.get(j)))
				{
				Count=Count+1;
				System.out.println(order.get(j));
				}
			}
		}
		Count=Count+1;
		System.out.println(Count);
	
	}
	
}
