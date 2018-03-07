/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
*/
package patternProgeams;

import java.util.Scanner;

public class Pattern210 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int space = 0;
		int i,j,k;
		for(i=n-1; i>=-(n-1); i--) {
			for(j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(k=j; k<=n; k++) {
				System.out.print(k+" ");
			}
			if(i>0)
				space++;
			else
				space--;
			System.out.println();
		}

	}

}
