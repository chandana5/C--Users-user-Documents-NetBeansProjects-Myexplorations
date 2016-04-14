package Practice;

import java.util.Stack;

public class Mergepartition {

	public static void LeftPartition(int[]AM,Stack<int[]>ls,Stack<int[]>Rs,int n)
	{
		while(n!=0)
		{
			int mid=n/2;
			int[]L=new int[n/2];
			int[]R=new int[n/2];
			int[]tempL=new int[n/2];
			tempL=ls.peek();
			for(int i=0;i<mid;i++)
			{
				L[i]=tempL[i];
				R[i]=tempL[mid+i];
			}

			ls.push(L);
			Rs.push(R);
			n=n/2;
		}

		System.out.println(ls.peek().toString());
		System.out.println(Rs.peek().toString());
	}


	public static void RightPartition(int[]AM,Stack<int[]>ls,Stack<int[]>Rs,int n)
	{

		while(n!=0)
		{
			int mid=n/2;
			int[]L=new int[n/2];
			int[]R=new int[n/2];
			int[]tempR=new int[n/2];
			tempR=Rs.peek();
			for(int i=0;i<mid;i++)
			{
				L[i]=tempR[i];
				R[i]=tempR[mid+i];
			}
			ls.push(L);
			Rs.push(R);
			n=n/2;
		}
		System.out.println(ls.peek().toString());
		System.out.println(Rs.peek().toString());
	}

	public static void main(String args[])
	{
		int[] AM={2,4,1,6,8,5,3,7};
	
		Stack<int[]> ls=new Stack<int[]>();
		ls.push(AM);
		Stack<int[]> Rs=new Stack<int[]>();
		Rs.push(AM);
		Stack<int[]> ls1=new Stack<int[]>();
		ls.push(AM);
		ls1.push(AM);
		Stack<int[]> Rs1=new Stack<int[]>();
		Rs.push(AM);
		Rs1.push(AM);
		int n=AM.length;
		LeftPartition(AM,ls,Rs,n);
		RightPartition(AM,ls1,Rs1,n);
	}


}

