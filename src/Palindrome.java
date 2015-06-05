import java.io.*;

public class Palindrome{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		int palinCount = 0;
		while(tcCount != 0){
			String inStr[] = (br.readLine()).split(" ");
			int a = Integer.parseInt(inStr[0]);
			int b = Integer.parseInt(inStr[1]);
			while(a <= b){
				palinCount += isPalindrome(a);
				a++;
			}
			System.out.println(palinCount);
			palinCount=0;
			tcCount--;
		}
	}
	
	static int isPalindrome(int num){
		int  revNum = toIntArray(num);
		if(num == revNum)
			return 1;
		else
			return 0;
	}
	
	static int toIntArray(int num){
		StringBuffer s = new StringBuffer(String.valueOf(num));
		return Integer.parseInt(s.reverse().toString());
	}
}