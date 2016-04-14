package PROG2_Muppalla_Chandana;

/* 1.taken two String stacks and get the elements of string array in to both of them by differentiating strings based on whether they are operator/ operand.  
 2. If you got two operands and one operator just pop out the operand 1,operator, operand 2   and parse the corresponding operands and based on operator chose any one of the if else statements for exact operation
 3. This process continues till we reach the end of the string and we do stack operations until they are empty
 4. returning the int value*/

import java.util.Stack;

public class Calculator {
	
	public static int Calculator(String[]str)
	{
		int result=0;
		Stack<String> operand=new Stack<String>();
		Stack<String> operator=new Stack<String>();
		for(int i=0;i<str.length;i++)//reading the whole string array
		{
			if(str[i].equals("+")||str[i].equals("-")||str[i].equals("*")||str[i].equals("/")||str[i].equals("%"))
				
			{
			operator.push(str[i]);
			}
			else
			{
				operand.push(str[i]);
			}
			while(operand.isEmpty()==false && operator.isEmpty()==false)// checking until  stacks are empty 
			{
				
			if(operator.size()==1)
			{
				
				if(operator.peek().equals("+"))//instead of if and else  we can even use swith cases 
				{
					int	second=Integer.parseInt(operand.pop());//we will get second operand first so pop other element also in that order do operation
					int first=Integer.parseInt(operand.pop());
			operand.push(Integer.toString((first+second)));
			operator.pop();
				}
				else if(operator.peek().equals("-"))
				{
					int	second=Integer.parseInt(operand.pop());
					int first=Integer.parseInt(operand.pop());
					operand.push(Integer.toString(first-second));
					operator.pop();
				}
				
				else if(operator.peek().equals("*"))
				{
					int	second=Integer.parseInt(operand.pop());
					int first=Integer.parseInt(operand.pop());
					operand.push(Integer.toString((first*second)));
					operator.pop();
				}
				else if(operator.peek().equals("/"))
				{
					int	second=Integer.parseInt(operand.pop());
					int first=Integer.parseInt(operand.pop());
					operand.push(Integer.toString(first/second));
					operator.pop();
				}
				else if(operator.peek().equals("%"))
				{
					int	second=Integer.parseInt(operand.pop());
					int first=Integer.parseInt(operand.pop());
					operand.push(Integer.toString(first%second));
					operator.pop();
				}
				
			}
			else
			break;
		}
			
		}
		
		result=Integer.parseInt(operand.peek());
		return result;
	}
	
	public static void main(String args[])
	
	{
		String str[]={"3", "2", "/", "4", "*"};
		System.out.println(Calculator(str));
	}

}
