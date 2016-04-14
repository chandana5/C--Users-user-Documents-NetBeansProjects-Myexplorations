
public class ListNode {
	int value;
	ListNode next;
	ListNode(int x)
	{
		value=x;
		next=null;
	}

	public static boolean addList( ListNode n1,int appendvalue)
	{

		while(n1.next!=null)
		{
			n1=n1.next;
		}

		n1.next=new ListNode(appendvalue);
		return true;

	} 
	public static void print(ListNode n1)
	{
		while(n1.next!=null){
			System.out.println(n1.value);
			n1=n1.next;
		}

	}



	public static void main(String args[])
	{
		ListNode n1 =new ListNode(0);

		addList(n1,1);
		addList(n1,2);
		addList(n1,3);
		addList(n1,4);
		addList(n1,5);
		addList(n1,6);
		
	}
}