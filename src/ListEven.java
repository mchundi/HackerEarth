import java.util.Scanner;

public class ListEven{
	public static void main(String args[]) throws Exception{
		
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			long num = input.nextLong();
			if(num == -1)
				System.exit(0);
			else if(num%2 == 0)
				System.out.println(num);
		}
	}
}