import java.io.*;
import java.util.Arrays;

public class GreaterBigger{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCnt = Integer.parseInt(br.readLine());
		while(tcCnt-- != 0){
			nextBig(br.readLine());
		}
	}
	static void nextBig(String s){
		String res="";
		int[] intArr = new int[s.length()];
		int i=0;
		for(i=0;i<s.length();i++)
			intArr[i] = (int)s.charAt(i);
		/*Arrays.sort(intArr);
		while(i-->0)
			res += (char)intArr[i];*/
		for(i=intArr.length-1;i>0;i--){
			if(intArr[i]>intArr[i-1]){
				int temp = intArr[i-1];
				intArr[i-1]=intArr[i];
				intArr[i]=temp;
				break;
			}
				
		}
		i=-1;
		while(i++<intArr.length-1)
			res += (char)intArr[i];
		System.out.println(res);
	}
}