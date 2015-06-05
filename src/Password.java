import java.io.*;
import java.util.Arrays;

public class Password{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inStrCnt = Integer.parseInt(br.readLine());
		String [] passwords = new String[inStrCnt];
		int i=0;
		while(inStrCnt != 0){
			passwords[i] = br.readLine();
			i++;
			inStrCnt--;
		}
		isPassword(passwords,0);
	}
	
	static void isPassword(String[] inStr,int index){
			StringBuffer s1 = new StringBuffer(inStr[index]);
			String revPswd = s1.reverse().toString();
			if(Arrays.asList(inStr).contains(revPswd))
				System.out.println(s1.length()+" "+s1.charAt(s1.length()/2));
			else
				isPassword(inStr,index+1);
	}
}