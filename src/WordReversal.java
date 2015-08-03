import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class WordReversal{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
		Stack<Character> tempStack = new Stack<Character>();
		for(int i=0 ;i<len;i++){
			if(s.charAt(i)!=' ')
				tempStack.push(s.charAt(i));
			else if(tempStack.isEmpty())
					System.out.print(s.charAt(i));
			else{
					while(!tempStack.isEmpty())
						System.out.print(tempStack.pop());
					System.out.print(s.charAt(i));
				}
		}
		while(!tempStack.isEmpty())
			System.out.print(tempStack.pop());
	}
}