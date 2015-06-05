import java.io.*;


public class EvenNumbers{
	
	public static void main(String args[]) throws Exception{
		//read the input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n!= -1){
			isEven(n);
			n=Integer.parseInt(br.readLine());
		}
	}
	
	static void isEven(int n){
		if(n%2==0)
			System.out.println(n);
	}
}