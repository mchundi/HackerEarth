/*
Given list A with 4 integers between 1 and 10,
you should come up with list B with three integers such that 
all the values in list A can be obtained by adding 1 or more values in list B. 
*/

package thoughtWorks;

import java.util.ArrayList;
import java.util.List;

public class OneFromAnother{
	public static void main(String args[]){
		List<Integer> sortedArr = new ArrayList<Integer>();
		List<String> resultList = new ArrayList<String>();
		for(int i = 1; i < 11; i++) {
			sortedArr.add(i);
		}
		
		for(int k = 0; k <= 6; k++) {
			for(int j = k+1; j <= 6; j++) {
				for(int i = j+1; i <= 6; i++) {
					int a = sortedArr.get(i);
					int b = sortedArr.get(j);
					int c = sortedArr.get(k);
					int d = a+b+c;
					if(d <= 10) {
						resultList.add("Parent String: "+a+", "+b+", "+c
								+" Result String: "+(a+b)+", "+(b+c)+", "+(a+c)+", "+d);
					}
				}
				if(sortedArr.get(k) + sortedArr.get(j) + sortedArr.get(j+1) > 10) {
					break;
				}
			}
			if(sortedArr.get(k) + sortedArr.get(k+1) + sortedArr.get(k+2) > 10) {
				break;
			}
		}
		
		for(int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
	}
}