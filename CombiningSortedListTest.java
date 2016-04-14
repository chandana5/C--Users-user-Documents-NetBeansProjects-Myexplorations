
public class CombiningSortedListTest {
	public static void main(String args[])
	{  Node n1=new Node(-1);
	Node n2=new Node(-1);
	Node first=n1;
	Node second=n2;
	
	int[] firstList={1,3,5,6};// array of elements.. Give your  first list elements
	int[] secondList={2,4,7,8};// array of elements.. Give your  first list elements
	Node test=new Node(-1);
	 Node List1=test.addList(firstList);// to add array elements in a List
	 Node List2=test.addList(secondList);
	 CombiningSortedList p=new CombiningSortedList();
	Node result= p.combineList(List1, List2);//passing  two Lists to be sorted
	 while(result!=null)// printing the list values
		{
		System.out.println(result.value);
		result=result.next;
		}
	
}}
