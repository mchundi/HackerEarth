import java.util.ArrayList;
import java.util.Scanner;

public class vNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			System.out.println(vNumCheck(sc.next()));
		}
	}
	static String vNumCheck(String num){
		ArrayList<Integer> a = toArray(num);
		int sum1=0,sum2=0;
		for(int i=0;i<a.size()/2;i++)
			sum1 = sum1+a.get(i);
		for(int i=a.size()/2;i<a.size();i++)
			sum2 = sum2+a.get(i);
		if(sum1==sum2)
			return "YES";
		else
			return "NO";
	}
	static ArrayList<Integer> toArray(String num){
		ArrayList<Integer> res = new ArrayList<Integer>();;
		for(int i=0;i<num.length();i++){
			int temp = Integer.parseInt(num.substring(i,i+1));
			res.add(temp%10);
		}
		return res;
	}
}