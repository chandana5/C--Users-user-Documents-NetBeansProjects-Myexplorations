import java.util.ArrayList;

public class ClockWiseTest {
	public static void main(String args[]){
		ClockWise c=new ClockWise();
	int[][] result=	c.constructMatrix(3);
	ArrayList<ArrayList<Integer>>StoreData=new ArrayList<ArrayList<Integer>>();// that is what we need to return
	for(int row=0;row<result.length;row++)
	{
		ArrayList<Integer> Line=new ArrayList<Integer>();
		for(int col=0;col<result[0].length;col++)
		{
			Line.add(result[row][col]);
		}
		StoreData.add(Line);
	}
	System.out.println(StoreData.toString());
		
	}

}
