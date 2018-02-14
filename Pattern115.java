package utility.programs;

import java.util.Scanner;

public class Pattern115 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter row size");
		int n = in.nextInt();
		int space = n-1;
		for(int i=0 ;i<n; i++) {
			for(int j=0; j<space; j++)
				System.out.print(" ");
			System.out.print("****");
			System.out.println();
			space--;
		}
	}

}
