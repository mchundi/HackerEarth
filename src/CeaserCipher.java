import java.io.*;

public class CeaserCipher{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int shiftCnt = Integer.parseInt(br.readLine());
		System.out.println(rotateStr(s,shiftCnt,len));
	}
	
	static String rotateStr(String s,int n,int len){
		String res="";
		for(int i=0;i<len;i++){
			int c = (int)s.charAt(i);
			if((c>=97 && c<=122)){
				c = c+n;
				if(c>122){
					while ( c>122)
						c= 97+ (c-122-1);
				}
				res = res+(char)c;
			}
			else if(c>=65 && c<=90){
				c+=n;
				if(c>90){
					while ( c>90)
						c= 65+ (c-90-1);
				}
				
				res = res+(char)c;
			}
			else
				res += s.charAt(i);
		}
		return res;
	}
}