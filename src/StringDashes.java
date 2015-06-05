import java.io.*;
import java.util.HashMap;

public class StringDashes{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(dashCount(input));
	}
	
	static int dashCount(String inStr){
		HashMap<Character,Integer> dashMap = new HashMap<Character,Integer>();
		dashMap = initializeMap(dashMap);
		int dashCnt = 0;
		for(int i=0;i<inStr.length();i++){
			if(dashMap.containsKey(inStr.charAt(i)))
				dashCnt= dashCnt+dashMap.get(inStr.charAt(i));
		}
		return dashCnt;
	}
	
	static HashMap<Character,Integer> initializeMap(HashMap<Character,Integer> dashMap){
		dashMap.put('0', 6);
		dashMap.put('1', 2);
		dashMap.put('2', 5);
		dashMap.put('3', 5);
		dashMap.put('4', 4);
		dashMap.put('5', 5);
		dashMap.put('6', 6);
		dashMap.put('7', 3);
		dashMap.put('8', 7);
		dashMap.put('9', 6);
		
		return dashMap;
	}
}