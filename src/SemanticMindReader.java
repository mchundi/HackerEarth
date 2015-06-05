import java.io.*;

public class SemanticMindReader{
	
	public static void main(String args[]) throws IOException{
		
		//Read the input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tcCount;i++){
			String url = br.readLine();
			if(url.length()>200 || url.length()<1)
				System.out.println("INVALID INPUT");
			else
				toType(url.toLowerCase());
		}
	}
	
	static void toType(String str){
		int len = str.length();
		String finalStr="";
		if(str.startsWith("www.")){
			str = str.substring(4,len);
			finalStr = isVowel(str);
		}
		else
			System.out.println("INVALID INPUT");
		
		System.out.println(finalStr.length()+"/"+len);
	}
	
	static String isVowel(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				str = str.substring(0, i)+str.substring(i+1,str.length());
			}
		}
		return str;	
	}
}