import java.util.Scanner;
import java.util.Stack;

public class SubSetAnd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tcCount = sc.nextInt();
		while(tcCount--!=0){
			int arrLen = sc.nextInt();
			Stack<Integer> arr = new Stack<Integer>();
			//int[] arr = new int[arrLen];
			for(int i=0;i<arrLen;i++)
				//arr[i]=sc.nextInt();
				arr.push(sc.nextInt());
			subSet(arr);//,0,arrLen);
		}
	}
	private static int resAnd=1;
	static void subSet(Stack<Integer> a){//,int startIndex,int endIndex){
		Stack<Integer> subArr = new Stack<Integer>();
		if(a.size()==0)
			return;
		else if(a.size()==1){
			resAnd = resAnd & a.pop();
			return;
		}
		else{
			for(int i=0;i<a.size();i++){
				resAnd=resAnd&a.get(i);
				subArr.push(a.get(i));
				if(resAnd%2==0){
					System.out.println("YES");
					return;//System.exit(0);
				}
				else{
					//subArr.remove(i);
					subSet(subArr);
				}
			}
		}
		System.out.println("NO");
	}
}