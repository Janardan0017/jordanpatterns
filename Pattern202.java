/*
11111
11122
11333
14444
55555
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern202 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((j<=n-i)?1:i);
			}
			System.out.println();
		}

	}

}
