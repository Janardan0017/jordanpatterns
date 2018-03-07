/*
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 

*/
package patternProgeams;

import java.util.Scanner;

public class Pattern213 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x;
		for(int i=1; i<=n; i++) {
			x = i;
			for(int j=1; j<=i; j++) {
				System.out.print(x+" ");
				x += n-j;
			}
			System.out.println();
		}

	}

}
