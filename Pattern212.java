/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern212 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int space = 0;
		int i,j;
		for(i=1; i<=n; i++) {
			for(j=0; j<n; j++) {
				System.out.print((i+j)%2);
			}			
			System.out.println();
		}
	}

}
