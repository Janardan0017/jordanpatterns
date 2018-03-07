/*
1
12
123
1234
12345
123456
1234567
123456
12345
1234
123
12
1
*/

package patternProgeams;

import java.util.Scanner;

public class Pattern203 {

	public static void main(String[] args) {
		System.out.println("enter a digit");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 1;
		for(int i=1; i<=(2*n-1); i++) {
			for(int j=1; j<=x; j++) {
				System.out.print(j);
			}
			System.out.println();
			if(i<n)
				x++;
			else
				x--;
		}

	}

}
