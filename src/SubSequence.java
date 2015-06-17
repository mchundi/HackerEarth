import java.util.Scanner;

public class SubSequence {

	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		int[] inArr = new int[1000000];
		int len = 0, count = 0;
		while (sc.hasNext()) {
			inArr[len] = sc.nextInt();
			len++;
		}
		for (int i = 0; i < len - 2; i++) {
			String s = "" + inArr[i] + inArr[i + 1] + inArr[i + 2];
			if (s.equals("101"))
				count++;
		}
		System.out.println(count);
	}
}