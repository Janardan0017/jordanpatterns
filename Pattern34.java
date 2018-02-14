package utility.programs;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter row size..");
		int n = in.nextInt();
		int z = 1;
		int space = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<z; k++)
				System.out.print("*");
			z = z + 2;
			space--;
			System.out.println();
		}
	}

}
