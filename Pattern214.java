/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern214 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print((i==j)?i:0);
			}
			System.out.println();
		}
	}
}
