package utility.programs;

import java.util.Scanner;

public class Pattern75 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter row size");
		int n = in.nextInt();
		int space = n-1;
		int star = 1;
		for(int i=0; i<2*n-1; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star; k++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<n-1) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
		}
	}

}
