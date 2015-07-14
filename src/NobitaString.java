import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NobitaString{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		String line[] = null;
		while(tcCnt-- != 0){
			line = br.readLine().split(" ");
			for(int i=line.length-1;i>=0;i--)
				System.out.print(line[i]+" ");
			System.out.println();
		}
	}
}