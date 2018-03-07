/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern204 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt()-1;
		int x;
		for(int i=n; i>=-n; i--) {
			x = 1;
			for(int j=0; j<=Math.abs(i); j++) {
				System.out.print(x++ + " ");
			}
			System.out.println();
		}


	}

}
