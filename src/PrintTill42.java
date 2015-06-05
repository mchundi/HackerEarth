import java.io.*;

public class PrintTill42{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n != 42){
			System.out.println(n);
			n = Integer.parseInt(br.readLine());
		}
			
	}
}