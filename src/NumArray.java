import java.util.Stack;


public class NumArray{
	public static void main(String args[]){
		int num = 12345;
		toArray(num);
	}
	static void toArray(int num){
		Stack<Integer> arr = new Stack<Integer>();
		while(num != 0){
			arr.push(num%10);
			num /= 10;
		}
		String res = arr.toString().substring(1, arr.toString().length()-1);
		System.out.println(new StringBuffer(res).reverse());
	}
}