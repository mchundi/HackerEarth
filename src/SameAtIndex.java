import java.io.*;

public class SameAtIndex{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String demand = br.readLine();
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount!=0){
			String inStr[] = (br.readLine()).split(" ");
			long a = Long.parseLong(inStr[0])-1;
			long b = Long.parseLong(inStr[1])-1;
			if(Math.max(a, b)<=demand.length())
				System.out.println(demandReply(demand,(int)a,(int)b));
			else{
				int index1 = (int) (a%demand.length());
				int index2 = (int) (b%demand.length());
				System.out.println(demandReply(demand,index1,index2));
			}
			tcCount--;
		}
	}
	
	static String demandReply(String s,int index1,int index2){
		if(s.charAt(index1)==s.charAt(index2))
			return "Yes";
		else
			return "No";
	}
}