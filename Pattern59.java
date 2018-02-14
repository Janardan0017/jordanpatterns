package utility.programs;

import java.util.Scanner;

public class Pattern59 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter row size..");
		int n = in.nextInt();
		int star = 1;
		for(int i=0; i<2*n;i++) {
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			if(i < n-1)
				star++;
			else
				star--;
			System.out.println();
		}
	}

}