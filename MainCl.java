/*
public class MainCl {


public class PartitionedLinkedList {
	   public static Node partition(Node head, int x) {
	      Node dummy1 = new Node(-1);    // the dummy head of nodes less than x
	      Node dummy2 = new Node(-1); 
	   // the dummy head of nodes no less than x
	      Node head1 = dummy1;
	      Node head2 = dummy2;
	      while (head != null)
	      {
	          if(head.value < x)
	          {
	              head1.next = head;
	              head1 = head1.next;
	              System.out.println("head1 val"+head1.value);
	          }
	          else
	          {
	              head2.next = head;
	              head2 = head2.next;
	              System.out.println("head2 val"+head2.value);
	          }
	          head = head.next;
	      }
	      head1.next = dummy2.next;  // bride the two sub lists together
	      head2.next = null;
	 return dummy1.next;
	    }
	
	public static Node createList(Node n1,int appendvalue)
		{
			Node start=n1;
		
		while(n1.next!=null)
		 {
			 n1=n1.next;
		 }
			
		n1.next=new Node(appendvalue);


		return start;

	}
	
	public static void main(String args[])
	{  Node n1=new Node(1);
	Node first=n1;
		
	
	
		createList(n1,6);
		createList(n1,4);
		createList(n1,5);
		createList(n1,1);
		createList(n1,1);
		createList(n1,2);
		createList(n1,3);
		createList(n1,0);
		createList(n1,18);
		createList(n1,10);
		
		 
		
	Node result=partition(first,3);
	while(result!=null)
	{
	System.out.println(result.value);
	result=result.next;
	}
		 
	
		for(int row=0;row<n;)
		{
			for(int col=0;col<n;)
			{
		for (i=i;i<=n*count;)
		{ 
			
		 if(up==n-2) 
				
		{
			 while(bottom<=n-1){
			 row=bottom;
			 col=right;
			normalMatrix[row][col]=i;
			System.out.println(i+" "+"row"+" "+row+" "+"col"+" " +col );
			up--;
			bottom++;
			i++;
			 }
			 if(up==-1)
			 {
				 up=up+1;
			 }
			 if(bottom==n)
			 {
				 bottom=bottom-1;
				 right--;
			 }
			
		}
		 else	if(right<n && up==n-1 && bottom==0 && left>=0)
		{
			normalMatrix[row][col]=i;
			System.out.println(i+" "+"row"+" "+row+" "+"col"+" " +col );
			right++;
			left--;
			col=right;
			if(right==n)
			{
				right=right-1;
			}
			if(left==-1)
			{
				left =left+1;
				up--;
				bottom++;
				
			}
			i++;
			
		}
		 else if(right==n-2)
		 {
			 while(left<n-1)
			 {
				 col=right;
			  normalMatrix[row][col]=i;
			System.out.println(i+" "+"row"+" "+row+" "+"col"+" " +col );
			left++;
			right--;
			
			i++;
			 }

			 if(right==-1)
				{
					right=right+1;
					up++;
					bottom--;
				}
				if(left==n)
				{
					left=left-1;
				
				}
			 
		 }
		 else if(bottom==n-2)
		 {
			 while(bottom>0)
			 {row=bottom;
			 normalMatrix[row][col]=i;
				System.out.println(i+" "+"row"+" "+row+" "+"col"+" " +col );
				up++;
				 bottom--;
					i++; 
			 }
			 right++;
		
		 }
			}
			
		count=count+1;
		}
			row++;	
		}
	 
}
}
public static Node createList(Node n1,int appendvalue)
		{
			Node start=n1;
		
		while(n1.next!=null)
		 {
			 n1=n1.next;
		 }
			
		n1.next=new Node(appendvalue);


		return start;

	}
	
	public static void main(String args[])
	{  Node n1=new Node(-1);
	Node first=n1;
		createList(n1,6);
		createList(n1,4);
		createList(n1,5);
		createList(n1,1);
		createList(n1,1);
		createList(n1,2);
		createList(n1,3);
		createList(n1,0);
		createList(n1,18);
		createList(n1,10);
		Node send=first.next;
		 
		
	Node result=partition(send,3);
	while(result!=null)
	{
	System.out.println(result.value);
	result=result.next;
	}

	
}
*/