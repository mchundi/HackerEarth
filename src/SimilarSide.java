import java.io.*;

public class SimilarSide{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount!=0){
			System.out.println(sameAdjacentChar(br.readLine()));
			tcCount--;
		}
	}
	
	static String sameAdjacentChar(String inStr){
		if(inStr.length()<=1)
			return inStr;
		for(int i=0;i<inStr.length()-1;i++){
			if(inStr.charAt(i)==inStr.charAt(i+1)){
				inStr = sameAdjacentChar(inStr.substring(0,i)+inStr.substring(i+1,inStr.length()));
			}
		}
		return inStr;
	}
}