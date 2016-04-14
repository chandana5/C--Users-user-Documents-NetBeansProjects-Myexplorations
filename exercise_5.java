import java.util.Scanner;

public class exercise_5 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
	      in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      String sentence = in.nextLine();
	 // for loop is to traverse the complete sentence length -1
	      for ( int i = sentence.length() - 1; i >= 0; i-- )
	      {
	         reverse = reverse + sentence.charAt(i);
	      }
	      // if the given original sentence equal to the reverse sentence then it is a palindrome
	      if (sentence.equals(reverse))
	      {
	         System.out.println("Entered string is a palindrome.");
	      }
	      else
	      {
	         System.out.println("Entered string is not a palindrome.");
	      }
	 
	}

}
