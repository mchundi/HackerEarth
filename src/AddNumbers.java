import java.io.*;
import java.util.StringTokenizer;


public class AddNumbers{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount != 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum=0;
			while(st.hasMoreTokens()){
				sum += Integer.parseInt(st.nextToken());
			}
			System.out.println(sum);
			tcCount--;
		}
	}
}