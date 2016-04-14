
public class MatrixMultiplicationTest {
	public static void main(String args[])
	{
		MatrixMultiplication m=new MatrixMultiplication();// creating object for the class
		 int[][] mux1={{1,2},{3,4}};
		 int[][] mux2={{2,2},{2,2},{2,2}};
		 int size1=mux1.length;
		 int size2=mux2[0].length;
		int[][] result=new int[size1][size2];
		if(mux1[0].length==mux2.length)
		{
	result=m.multiple(mux1,mux2,result);// sending matrices to be multiplied and a output matrix to store data
	System.out.print("[");//printing format--opening brace
	for( int row1=0;row1<result.length;row1++)
	{
		for( int col1=0;col1<result[0].length;col1++)//reading every element of the matrix
		{
			System.out.print(result[row1][col1]);// printing the elements
			if(col1!=result[0].length-1)// if it is not the ending row then separate it with a comma
			System.out.print(",");
			else if(col1==result[0].length-1 && row1<result.length-1)// end the row has to have a semicolon
				System.out.print(";");
			else if(col1==result[0].length-1 && row1==result.length-1)
				System.out.print("];");
		}
		System.out.println();
	}
		}
		else
		{
			System.out.println("Product is not possible");
		}
}

}
