
		public class Node {

			int value;

			Node next;

			public Node(int x)

			{  value=x;

			next=null;

			}

			public static Node addList(int[]a )

			{

			int i=0	;

			Node  r=new Node(i);
			    Node start = r;

			for(i=0; i<a.length ; ){

			if(r.next!=null)

			{

			r=r.next;

			}

			r.next=new Node(a[i]);

			i++;

			}

			return start.next;

			}
	
	
}
