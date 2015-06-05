import java.io.*;

public class StringReverse{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount != 0){
			StringBuffer revStr = new StringBuffer(br.readLine());
			System.out.println(revStr.reverse());
			tcCount--;
		}
	}
}