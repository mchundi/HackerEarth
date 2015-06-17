import java.util.LinkedList;
import java.util.Scanner;

public class MonkFood{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int queryCnt = sc.nextInt();
		LinkedList<Integer> foodPackage = new LinkedList<Integer>();
		
		while(queryCnt-- != 0){
			int queryType = sc.nextInt();
			if(queryType==1){
				if(foodPackage.isEmpty())
					System.out.println("No Food");
				else{
					System.out.println(foodPackage.getFirst());
					foodPackage.pop();
				}
			}
			if(queryType == 2){
				foodPackage.push(sc.nextInt());
			}
		}
	}
}