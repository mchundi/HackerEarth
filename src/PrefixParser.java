import java.util.*;
import java.io.*;

public class PrefixParser{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		while(tcCnt-- != 0){
			System.out.println(calculate(br.readLine()));
		}
	}
	
	static int calculate(String s){
		Stack<Character> operator = new Stack<Character>();
		Stack<Integer> num = new Stack<Integer>();
		Scanner sc = new Scanner(s);
		int res =0;
		char ch = ' ';
		String in = sc.next();
		while(! in.equals("?")){
			if(isOperator(in.charAt(0))){
				ch = in.charAt(0);
				operator.push(ch);
			}
			else {
				int n = Integer.parseInt(in);
				if(num.size()<1)
					num.push(n);
				else{
						int a = num.pop();
						int b = n;
						char op = operator.pop();
						res = perform(a,op,b);
						num.push(res);
				}
			}
			in = sc.next();
		}
		return res;
	}
	
	static boolean isOperator(char c){
		List<Character> opList = new ArrayList<Character>();
		opList.add('+');
		opList.add('-');
		opList.add('*');
		opList.add('/');
		opList.add('$');
		
		if(opList.contains(c))
			return true;
		else
			return false;
	}
	
	
	static int perform(int a,char op,int b){
		int res=0;
		switch(op){
		case '+': res=a+b;
				  break;
		case '-': res=a-b;
		          break;
		case '*': res=a*b;
		          break;
		case '/': res=a/b;
		          break;
		}
		return res;
	}
}