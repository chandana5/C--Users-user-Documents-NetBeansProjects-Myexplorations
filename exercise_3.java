import java.util.Scanner;

public class exercise_3 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s = new Scanner(System.in);
		System.out.println("Enter First String");  // enter the first string
		String firststring =s.nextLine();
		System.out.println("Enter Second String");  // enter the second string
		String secondstring =s.nextLine();
		String returnedString = "";  
	// for loop is to traverse the complete first string length
		for (int i = 0; i < firststring.length(); i++) 
		{
			// for loop is to traverse the complete second string length
            for (int j = 0; j < secondstring.length(); j++) 
            {
   // if returned string is not true the returned string will be one value from first and one value from second string
            	if(!returnedString.contains("" + firststring.charAt(i)
		                        + secondstring.charAt(j) + ""))
            			{
            returnedString = returnedString + firststring.charAt(i)
                    + secondstring.charAt(j) + " ";
            			}
            }
        }
		System.out.println("Returned String : " + returnedString);
	}

}
