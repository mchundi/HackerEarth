import java.io.*;
import java.util.*;

public class XennyUniqueness{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		List<String> input = new ArrayList<String>();
		int count=0;
		while(tcCnt--!=0){
			String s = br.readLine();
			if(!input.contains(s)){
				count++;
				input.add(s);
			}
		}
		System.out.println(count);
	}
}