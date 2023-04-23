/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int chocolateTastiness = 2 * x;
            int candyTastiness = 5 * y;
            if (chocolateTastiness > candyTastiness) {
                System.out.println("Chocolate");
            } else if (candyTastiness > chocolateTastiness) {
                System.out.println("Candy");
            } else {
                System.out.println("Either");
            }
        }
        scanner.close();
		// your code goes here
	}
}
