//Print a character 1000 times without using loop and recursion.
package thoughtWorks;

public class PrintWithoutLoop{
	
	public static void main(String args[]){
		String magic = new String(new char[1000]).replace("\0", "a");
 		System.out.println(magic);
	}
}
