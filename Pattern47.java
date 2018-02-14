package utility.programs;

import java.util.Scanner;

public class Pattern47 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter row size..");
		int n = in.nextInt();
		int star = 2*n - 1;
		int space = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star; k++)
				System.out.print("*");
			star = star - 2;
			space++;
			System.out.println();
		}

	}

}
