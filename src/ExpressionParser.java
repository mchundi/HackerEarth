/**
 * This program reads a string input and validates if it has balanced parenthesis and balanced square parenthesis.
 * Counters parenthesisCnt and sqParenthesisCnt are incremented whenever a match is found
 * when the entire string is parsed, check is made to verify if the counters are even or odd
 * even counters indicate that the string has balanced parenthesis
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class ExpressionParser{
	
	public static void main(String args[]) throws Exception{
		//Read the expression
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String parserString = br.readLine();
		
		System.out.println( isBalanced(parserString) ? "Balanced" : "Not Balanced");
	}
	
	//This method returns true if the expression has balanced parentheses AND balanced square brackets,
	static boolean isBalanced(String str){
		//if input is an empty string return false
		if(str==null)
			return false;
		else{
			Stack<Character> braceStack = new Stack<Character>();
			char c;
			for(int i=0;i<str.length();i++){
				c=str.charAt(i);
				//push to stack if the incoming element is an open parenthesis
				if(c=='('){	
					braceStack.push(c);
				}
				//if the incoming character is a closing parenthesis and if the stack is not empty, expression is not balance.
				else if(c==')'){
					if(braceStack.isEmpty() )
						return false;
					//if the incoming character is a closing parenthesis and if the stack top is an open parenthesis,
					//pop the element
					else if(braceStack.peek() == '(')
						braceStack.pop();
				}
				//push to stack if the incoming element is an open square parenthesis
				else if(c=='['){
					braceStack.push(c);
				}
				//if the incoming character is a closing square parenthesis and if the stack is not empty, expression is not balance.
				else if(c==']'){
					if(braceStack.isEmpty() )
						return false;
					//if the incoming character is a closing parenthesis and if the stack top is an open square parenthesis,
					//pop the element
					else if(braceStack.peek() == '[')
						braceStack.pop();
				}
			}
			if(braceStack.isEmpty())
				return true;
			else
				return false;
		}
	}
}
		
		