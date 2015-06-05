import java.io.*;

public class CompleteString{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount!=0){
			String inStr = br.readLine();
			System.out.println(isComplete(inStr.toLowerCase()));
		}
	}
	
	static String isComplete(String s){
		int count=0;
		int alphaArray[] = {97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
		for(int i=0;i<s.length();i++){
			int alphaChar = (int)s.charAt(i);
			if( isAlpha(alphaChar,alphaArray))
				count++;
		}
		if(count == 26)
			return "YES";
		else
			return "NO";
	}
	
	static boolean isAlpha(int c, int[] inArr){
		for(int i=0;i<inArr.length;i++){
			if(c==inArr[i]){
				inArr[i]=0;
				return true;
			}
		}
		return false;
	}
}