
public class PartitionListTest {
	public static void main(String args[])
	{
		int[] a={1,4,3,2,5,2};// array of elements.. Give your list elements
		Node test=new Node(-1);
		 Node x=test.addList(a);// to add array elements in a List
		 PartitionedLinkedList p=new PartitionedLinkedList();
		Node result= p.partition(x, 3);//passing the element where to be partitioned and list of elements
		 while(result!=null)// printing the list values
			{
			System.out.println(result.value);
			result=result.next;
			}
		 
		 
		 
		 // another method for Adding elements in the list by calling add List method for .. for every element we need to call the addList method
		 
		 
		/* 
		 * 
		Node test=new Node(-1);
        Node n1=new Node(-1)
			test.addList(n1,1);
			test.addList(n1,2);
			 test.addList(n1,3);
			test.addList(n1,4);
			test.addList(n1,5);
			test.addList(n1,6);*/
		 
		 
		 
			
	   
		 }
	

}
