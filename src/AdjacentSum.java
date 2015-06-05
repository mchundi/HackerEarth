import java.io.*;

public class AdjacentSum{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcCount = Integer.parseInt(br.readLine());
		while(tcCount !=0){
			String[] tcStr =(br.readLine()).trim().split(" "); 
			int arraySize = Integer.parseInt(tcStr[0]);
			int giftFund = Integer.parseInt(tcStr[tcStr.length-1]);
			int cost[] = new int[arraySize];
			for(int i=0;i<arraySize;i++)
				cost[i] = Integer.parseInt(br.readLine());
			isPartyOn(cost,giftFund);
			tcCount--;
		}
	}
	
	static void isPartyOn(int[] inArr,int fund){
		int i=0,j=0;
		int sum = inArr[0];
		while(j<inArr.length || i<inArr.length){
			if(sum == fund){
				System.out.println("YES");
				return;
			}
			else if(sum < fund){
				sum += inArr[j];
				j++;
			}
			else if(sum > fund){
				if(i == j){
					i++;
					j++;
				}
				sum += inArr[j];
			}
			sum += inArr[i];
			i++;
		}
		return;
	}
}