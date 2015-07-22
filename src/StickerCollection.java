import java.math.BigInteger;
import java.util.Scanner;


public class StickerCollection{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger limit = (BigInteger.valueOf(3).multiply(BigInteger.TEN)).pow(8);
		BigInteger sticker;
		int stickerCnt =0;
		while(n--!=0){
			sticker = sc.nextBigInteger();
			if(sticker.compareTo(limit)<0)
				stickerCnt++;
		}
		System.out.println(stickerCnt);
	}
}