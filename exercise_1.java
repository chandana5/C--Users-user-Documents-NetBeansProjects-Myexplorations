import java.util.StringTokenizer;

public class exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=0;i<args.length;i++) //for loop to traverse the sentence 
         {
         StringTokenizer words = new StringTokenizer(args[i]);   // used for breaking the sentence
      // checking whether word has more elements 
         //if yes take the sentence take its value and print the word with its index value  
         while(words.hasMoreElements())  
         {
                 String word = words.nextToken();
                 String set =String.valueOf(i);
                 System.out.println("args["+set +"] " + "is"+ " " +word);
         }

         }
	}
}
