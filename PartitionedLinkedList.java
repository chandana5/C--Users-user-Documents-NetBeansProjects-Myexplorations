/* sending a list and a partition value ,taking two other lists and adding the elements less than given value in one list and all other elements which are greater than it in other one
 * 2. Merging the lists. That is the second list to first list
 * 3. Then return the whole list
 * 4. created a addList method in Node class for adding elements in the list and array of elements are taken each element is retrieved and added to List
 * 5. Even a each element is added to the list by calling addList function everytime
 * */

public class PartitionedLinkedList {
	   public static Node partition(Node mainhead, int x) {
	      Node dummy1 = new Node(0);    
	      Node dummy2 = new Node(0); 
	     
	   
	      Node h1 = dummy1;// these h1 and h2 are taken to refer the start of each partitioned List
	     
	      Node h2 = dummy2;
	     
	     
	      while (mainhead != null)
	      {
	          if(mainhead.value < x)// checking  with  mainList values that are less than the given value and adding them in to h1 list
	          { 
	              h1.next = mainhead;
	              h1 = h1.next;
	            
	          }
	          else
	          {
	              h2.next = mainhead;// greater than values
	              h2 = h2.next;
	            
	          }
	          mainhead = mainhead.next; // incrementing main list after each comparision
	          
	      }
	      h1.next=null;
	      h2.next=null;
	     
	      h1.next = dummy2.next;  // end of the first List attached to second List
	      h2.next = null;// end of second List is a null
	     
	 return dummy1.next;// returing the h1 list reference that is rather than whole list after partition
	    }
	
	
		 
	
	 
}


	