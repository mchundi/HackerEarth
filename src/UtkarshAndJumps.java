import java.io.*;

public class UtkarshAndJumps{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int endPoint = Integer.parseInt(input[0]);
		double prob2Steps = Double.parseDouble(input[1])/100;
		double prob3Steps = 1-prob2Steps;
		int twoSteps =0, threeSteps=0;
		while(endPoint != 0 ){
			if(endPoint%2 == 0){
				System.out.println((endPoint/2)*prob2Steps);
				System.exit(0);
			}
			else if(endPoint%3 == 0){
				System.out.println((endPoint/3)*prob3Steps);
				System.exit(0);
			}
			else if(endPoint/2 >2){
				twoSteps++;
				endPoint -= 2;
			}
			else if(endPoint/3 >3){
				threeSteps++;
				endPoint -= 3;
			}
		}
		System.out.println((twoSteps*prob2Steps)+(threeSteps*prob3Steps));
	}
}