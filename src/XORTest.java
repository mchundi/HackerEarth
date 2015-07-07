/*
 * The Great Mathematician Fing Fong Foo was planning to test his students on the XOR operator. He conducted the test as described below:

He gave a sequence of N numbers A[1], A[2], A[3], ... ,A[N] to his students. Then, he asked them to perform some operations on the numbers in the following way. He specified two operations as

0 X Y - print A[X] XOR A[X+1] XOR A[X+2] .... A[Y]

1 X Y - replace A[X] by A[X] XOR Y

After the test was over, Fing Fong Foo sat down to evaluate the answer sheets and it was then that he realized that he had forgotten to bring the answers himself.

Help him to generate the right answers.

INPUT :

The first line of the input is a number N and N space separated integers follow in the second line. The third line contains the number of operations Q and then each of the remaining Q lines contain three space separated integers C X Y( defined in the operations section above).

OUTPUT :

For each operation of the form 0 X Y, display the answer for the operation in a separate line.

CONSTRAINTS:

0 < N <= 1000000

0 < Q <= 100000

0<= A[i] <= 1000000

Sample Input(Plaintext Link)
 5
1 2 3 4 5
5
0 3 4
1 3 4
0 3 4
1 4 3
0 3 4
Sample Output(Plaintext Link)
 7
3
0

 */



import java.util.Scanner;

public class XORTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] inArr = new int[n];
		for(int i=0;i<n;i++)
			inArr[i]=sc.nextInt();
		int queryCnt = sc.nextInt();
		int res=0;
		while(queryCnt-- != 0){
			int type = sc.nextInt();
			int startIndex = sc.nextInt()-1;
			int endIndex = sc.nextInt()-1;
			
			if(type == 0){
				while(startIndex<=endIndex){
					res = res^inArr[startIndex++];
				}
				System.out.println(res);
			}
			else{
				res = inArr[startIndex]^endIndex;
				inArr[startIndex] = res;
			}
		}
	}
}