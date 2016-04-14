
public class DuplicateRemoval {
	public static void main(String[] args) {
		
		
		int i=0;
		int totalcount=0;
		int numbercount=1;
		
		
		int[] a={1,1,1,1,2,2,2,4,6,6,6,6,9,9,9};
		int count=0;
		int pos=0;
		for(i=a.length-1; i>=0;)
		{ 
			
		if(i!=0 && a[i]==a[i-1])
		{
			count =count+1;
			
			
		}
		
		else if(count!=0)
		{ 
			
		if (pos==0)
		{a[i]=a[i+(count)];//replacing
		
		for( int j=a.length-1; a[j]==-1;)
		{
			a[j]=-1;
			j--;
		}	
		}
		else
		{
			a[i+1]=a[i+(count)+1];//replacing
			
			for( int j=a.length-1; a[j]==-1;)
			{
				a[j]=-1;
				j--;
			}	
		}
		
		
		pos++;
		
			System.out.println();
			numbercount++;
			
			System.out.println("i value"+ i+" "+a[i]);
			
			System.out.println(" individual count"+ count);
		totalcount=totalcount+count;
		System.out.println("totalcount "+totalcount);
		count=0;
		
			
		}
		i=i-1;
	
	}

}
}
