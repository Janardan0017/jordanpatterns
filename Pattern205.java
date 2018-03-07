/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5
*/ 
package patternProgeams;

import java.util.Scanner;

public class Pattern205 {

	public static void main(String[] args) {
		
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(n-j + " ");
			}
			System.out.println();
		}

	}

}
