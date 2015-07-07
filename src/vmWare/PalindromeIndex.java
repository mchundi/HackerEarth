package vmWare;

import java.util.Scanner;

public class PalindromeIndex{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			String s = sc.next();
			if(s.length()==0 || isPalindrome(s)){
				System.out.println("-1");
			}
			else
				System.out.println(indexPalindrome(s));
		}
	}
	
	static int indexPalindrome(String s){
		int index=-1;
		
		for(int i=0,j=s.length()-1;i<j;i++,j--){
			if(s.charAt(i) != s.charAt(j)){
				if(isPalindrome(s.substring(i+1,j+1))){
					index=i;
					break;
				}
				else
					index=j;
			}
		}
		return index;
	}
	
	static boolean isPalindrome(String inStr){
		String revStr = new StringBuffer(inStr).reverse().toString();
		if(inStr.equals(revStr))
			return true;
		else
			return false;
	}
}