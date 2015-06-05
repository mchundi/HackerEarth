/**
 * This program reads a string input and validates if it has balanced parenthesis and balanced square parenthesis.
 * Counters parenthesisCnt and sqParenthesisCnt are incremented whenever a match is found
 * when the entire string is parsed, check is made to verify if the counters are even or odd
 * even counters indicate that the string has balanced parenthesis
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ExpressionParser{
	
	public static void main(String args[]) throws Exception{
		//Read the expression
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String parserString = br.readLine();
		System.out.println(isBalanced(parserString));
	}
	
	//This method returns true if the expression has balanced parentheses AND balanced square brackets,
	static boolean isBalanced(String str){
		
		boolean parenthesis = isParenthesisBalanced(str,'(',')');
		boolean sqParenthesis = isParenthesisBalanced(str,'[',']');
		
		if(parenthesis && sqParenthesis)
			return true;
		else
			return false;
	}
	
	//returns true if the open and close parenthesis are matching
	static boolean isParenthesisBalanced(String inStr,char openCh, char closeCh){
		int openParanthesisIndex = inStr.indexOf(openCh);
		int	closeParanthesisIndex = inStr.indexOf(closeCh);
		
		if(openParanthesisIndex>=0 && closeParanthesisIndex>0 && openParanthesisIndex<closeParanthesisIndex){
			isParenthesisBalanced(inStr.substring(0,openParanthesisIndex)
					              +inStr.substring(openParanthesisIndex+1,closeParanthesisIndex)
					              +inStr.substring(closeParanthesisIndex+1,inStr.length())
					              ,openCh,closeCh);
			return true;
		}	
		else
			return false;
	}
}