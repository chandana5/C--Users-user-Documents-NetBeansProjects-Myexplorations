import java.util.Scanner;

public class exercise_4 {

	public static String ConvertUpLowSentence(String sentence)
	{
		String newSentence = "" ;
		int j =0;
        // for loop is to traverse the complete sentence length 
        for (int i = 0; i < sentence.length(); i++) 
        { 
        char currentChar = sentence.charAt(i); 
        // checking if the character is not a letter leave as it is and continue
         if(!Character.isLetter(sentence.charAt(i))) 
         {
                 newSentence = newSentence + currentChar;
                 continue; 
         }
         // if j is divisible by 2 make that particular character to upper case
         if ((j % 2) == 0) 
         { 
         newSentence = newSentence +Character.toUpperCase(currentChar); 
         } 
         // else make that particular character to lower case
         else        
         { 
         newSentence += Character.toLowerCase(currentChar); 
         } 
         // increment the j value
         j++;
         } 
		return newSentence;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");  // enter the sentence
		String sentence =s.nextLine();
		System.out.println("Original sentence: " + sentence);
        String newsentence = ConvertUpLowSentence(sentence);
        System.out.println("Return sentence: " + newsentence);
        }

}
