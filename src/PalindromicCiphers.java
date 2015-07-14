import java.io.*;

public class PalindromicCiphers{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		while(tcCnt--!=0){
			String inStr = br.readLine();
			if(isPalindrome(inStr))
				System.out.println("Palindrome");
			else
				System.out.println(value(inStr));
		}
	}
	static boolean isPalindrome(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
	static long value(String s){
		long res=1;
		for(int i=0;i<s.length();i++){
			int c = ((int)s.charAt(i)-96);
			res *= c;
		}
		return res;
	}
}