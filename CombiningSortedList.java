/*1.Sending the array of elements in to addList method  and passing the  two Lists as arguments to the combineList method
 * 2.Taking combination as the List that takes the result of sorted List out of two list elements
 * 3. Comparing second List elements with first list elements if they are less than the current element that is being inserted and being connected to the List element preceding it.
 * 4.This Comparison is done through the end of lists
 * */
public class CombiningSortedList {
	
	public static  Node combineList(Node n1,Node n2){
		
		Node dummy1=n1.next;//reference to firstList
		Node dummy2=n2.next;// reference to secondList
		
		Node combination=new Node(-1);// result sorted List reference
	        Node tmp = combination;
	 
	        while(dummy1 != null && dummy2 != null){// either of the list is empty or referencing null value it says end of the list and comes out of the loop
	          if(dummy1.value <= dummy2.value){// comparing the values of one List to other add those elements into resultList
	              tmp.next = dummy1;// if so inserting
	              dummy1 = dummy1.next;
	          }else{
	              tmp.next = dummy2;// else iterating to next element and add those elements into resultList
	              dummy2 = dummy2.next;
	          }
	 
	          tmp = tmp.next;// incrementing the result List
	        }
	     // attaching two Lists  after sorting
	        if(dummy1 != null)
	            tmp.next = dummy1;
	        if(dummy2 != null)
	           tmp.next = dummy2;
	 
	        return combination.next;
	    }
	
}

