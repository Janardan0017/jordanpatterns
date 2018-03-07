/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern201 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
