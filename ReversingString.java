package PROG2_Muppalla_Chandana;

/*1.since it is reversing the sentence we need to split the string based on space 
 * 2. Read each element in to string array
 * 3. either reverse the string array elements by placing first element in last and vice verse by traversing until half
 * 4. or else just read it from back and concat each element to a string along with space after each element from string array .
 * 
 * 5.This has to be done until the whole string array is read
 * 6. Resultant string is a reversed string*/
public class ReversingString {
	public static String reverseString(String str)
	{
		String res="";
		String[] mysplit=new String[str.length()];
        mysplit= str.split(" ");
		String temp;
		for(int i=0;i<mysplit.length/2;i++)// we can just read it reverse rather than actually  reversing in the array
		{
			temp=mysplit[i];
			mysplit[i]=mysplit[mysplit.length-(i+1)];
			mysplit[mysplit.length-(i+1)]=temp;
		}
		for(int i=0;i<mysplit.length;i++)//or else we can even use the stack to pop out then we need to use Stack of array instead of string array
		{
			res=res.concat(mysplit[i]).concat(" ");//concating the space since each word is separated by it
		}
		return res;
	}
	public static void main(String args[])
	{
		String str="HI  am Chandana";
		System.out.println(reverseString(str));
	}
}
