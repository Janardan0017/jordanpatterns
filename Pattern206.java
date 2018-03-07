/*
7 
7 6 
7 6 5 
7 6 5 4 
7 6 5 4 3 
7 6 5 4 3 2 
7 6 5 4 3 2 1 
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern206 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(n-j + " ");
			}
			System.out.println();
		}

	}

}
