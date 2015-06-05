import java.io.*;

public class FizzBuzz{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inStr = new String[Integer.parseInt(br.readLine())];
		inStr = br.readLine().split(" ");
		for(int i=0;i<inStr.length;i++){
			printFizzBuzz(Integer.parseInt(inStr[i]));
		}
	}
	
	static void printFizzBuzz(int n){
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}
}