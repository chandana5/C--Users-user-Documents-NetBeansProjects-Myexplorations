
public class JumpGame {
	public static void main (String args[]){
	int [] jumpingarray={2,2,0,1,4};
	boolean result= jump(jumpingarray);
	System.out.println(result);
	
	
	}
	public static boolean jump(int jumpingarray[]){
		if(jumpingarray.length==1 && jumpingarray[0]!=0)//for arrayLength one
		{
			return false;
		}
	for(int i=0;i<jumpingarray.length-1  && jumpingarray.length>1 ;i=jumpingarray[i]+i)
	{
		
		//condition1: first index of the element cannot be more than the array.length and  cannot be zero;
		if(jumpingarray[0]>jumpingarray.length || jumpingarray[0]==0 )
			
		{
			return false;
		}
		//condition 2:Any number through jumping other than the last index element is 0
		if( jumpingarray[i]< jumpingarray.length-1 && jumpingarray[i]==0)
		{
			return false;
		}
		
		//condition3:current element cannot be more than arrayLength 
		if( jumpingarray[i]>jumpingarray.length )
		{ 
			return false;	
		}
		//condition4:current element does not reach the end of the array and the elememt is not less that subtarction between  total arrayLength and current index 
		if(i!=(jumpingarray.length-1) && jumpingarray[i]> jumpingarray.length-1-i )
		{
			return false;	
		}
		
		
	
}
	return true;
	
}
	
}