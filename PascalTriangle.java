
/*Constructing a pascal traingle  by passing the n value to method .
 * 1.Take array of arrayList to copy store the values of each array elements.
 * 2.New ArrayList is being created once the elements of one particular array is placed in the array of arrayList
 * 3.To get a pascal sequence run a for loop until 'n' value
 *  Generate first value starting from 1  and place it in the first array and add directly add it in the array of arrayList.
 *  From the second sequence the start and end of elements in the array are 1 and rest of the elements in between each array  are summation of elements in previous array. 
 * */
	import java.util.ArrayList;
	public class PascalTriangle {
		
		public static ArrayList<ArrayList<Integer>> pascalbuild(int n)
		{
			 ArrayList<ArrayList<Integer>>a=new ArrayList<ArrayList<Integer>>();
			 for(int i=0;i<n;i++)
				{
					
					ArrayList<Integer> ai=new ArrayList();
					
					for(int j=0;j<=i;j++)
					{
						if(j==0)
						{
						ai.add(1);// first element of an array
						}
						else if( j!=i)// rest of elements
						{
							ai.add(a.get(i-1).get(j)+a.get(i-1).get(j-1));// adding in the array of arraylist by summing up previous array elements
						}
						else if(j==i)// last element of an array
						{
							ai.add(1);
						}
						
						
					}
					a.add(ai);
					
				
					
				}
			return a;
		}
		
	}



