import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCnt = sc.nextInt();
		//LinkedHashMap<Integer,Integer> diskStack = new LinkedHashMap<Integer,Integer>();
		Stack<Integer> radiusDisk = new Stack<Integer>();
		Stack<Integer> heightDisk = new Stack<Integer>();
		int towerHeight = 0;
		
		while(tcCnt-- != 0){
			int diskCnt = sc.nextInt();
			while(diskCnt--!=0){
				int radius = sc.nextInt();
				int height = sc.nextInt();
				if(radiusDisk.size()==0 && heightDisk.size()==0){
					//diskStack.put(radius,height);
					radiusDisk.push(radius);
					heightDisk.push(height);
					towerHeight += height;
				}
				else{
					if(radius<radiusDisk.peek() && height<heightDisk.peek()){
						radiusDisk.push(radius);
						heightDisk.push(height);
						towerHeight += height;
					}
				}
			}
			System.out.println(towerHeight);
			radiusDisk.clear();
			heightDisk.clear();
			towerHeight=0;
		}
	}
}