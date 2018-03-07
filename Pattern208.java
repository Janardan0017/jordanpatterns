/*
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 5 6 5 4 3 2 1 
1 2 3 4 5 6 7 6 5 4 3 2 1 
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern208 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x;
		for(int i=0; i<n; i++) {
			x = 1;
			for(int j=i; j>=-i; j--) {
				System.out.print((j>0) ? x++ + " ": x-- + " ");
			}
			System.out.println();
		}
	}

}
