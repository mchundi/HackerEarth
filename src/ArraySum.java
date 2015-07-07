import java.util.*;

public class ArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        long sum=0;
        while(arrLen-- != 0)
            sum += sc.nextInt();
        System.out.println(sum);
    }
}