/*
The person who wrote this problem is going through the bad phase of his life. But, fortunately he won some cash in his last programming event.
Now to make his girlfriend feel special, he wants to buy her some chocolates. As mentioned, he is not having good time so he want to spend as less as possible.
Keeping that in mind, he decided to play a game with her. The rule of game is as follows:
1) There are N chocolates represented by type 1..N
2) He will arrange them in a row in some random order
3) Now she (his girlfriend ofcourse) has to pick an index say i, then she will get all the chocolates at index j such that j>i and type of chocolate at j is strictly less than type of chocolate at index i.

He believes that his girlfriend is not that clever and will surely not choose the most optimal index, but he wants to know that if by any chance she picked the optimal index then how many chocolates will he have to buy.

Input:
First line contain N. then next line contain N space separated integers.

output : 
A single integer which is the answer.

Constraints :
1 ≤ N ≤ 105

1<=A[i]<=10^5

Sample Input(Plaintext Link)
 10
7 6 10 5 2 8 1 9 3 4 
Sample Output(Plaintext Link)
 7
*/


import java.util.Scanner;

public class ChocolateGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] weight = new int[n];
		for(int i=0;i<n;i++)
			weight[i]=sc.nextInt();
		System.out.println(maxChocolates(weight));
	}
	
	static int maxChocolates(int[] a){
		int[] max = new int[a.length];
		
		if(a.length>0)
			max[0]=1;
		int c = 0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j] && j>=i){
					max[i]++;
				}
				else
					break;
			}
			if(max[i]>c)
				c=max[i];
		}
		return c;
	}
}