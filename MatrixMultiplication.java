/*The multiple function will take two matrices and their product is calculated and set in to result matrix
 * 1.Each  horizontal row is taken  taken and multiplied by every vertical column( 1 st row elements in 1st matrix and all other column elements in next elements  For instance 1 row is taken and elements in that row and all 
 *  elements in column sequence  of second matrix are multiplied by the row elements of 1 st matrix. and then adding each corresponding row and column elements
 *  
 *  2. To have a Product --No.of columns in first matrix must be equal to No. of rows in second matrix
 *  3.The resultant matrix is having  row count =No.of rows of 1st matrix and column count =No.of columns in second matrix
 * */
public class MatrixMultiplication {
	
	public static int[][] multiple(int[][]mux1,int[][]mux2,int[][]result)
	{
	 for(int row1=0;row1<mux1.length;row1++)// 1st matrix row increment
		 {
		for(int col2=0;col2<mux2[0].length;col2++)// second matrix column increment
		{   int sum=0;//setting up and resetting to zero once the summation of each row is completed.
			for( int row2=0,col1=0;row2<=col1 && row2<mux1[0].length;col1++,row2++)// taking each row and increment the second matrix elements in column wise
			{
				sum=sum+mux1[row1][col1]*mux2[row2][col2];// summing up the elements after multiplying 
			}
			
			for(int row3=0;row3<=col2;row3++)// result matrix taking the row of the first matrix and column of second matrix
			{
				for(int col3=0;col3<=row1;col3++)
				{
					result[row1][col2]=sum;
				}
			}
		}
		}
		return result;
		
	}
	
}
