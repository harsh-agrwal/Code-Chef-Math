/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); //for No. of test cases
		while(T-->0) {
		    //your code goes here
		    int x = in.nextInt(); // cost of renting a cooler per month
		    int y = in.nextInt(); //cost to buy a cooler
		    int m = in.nextInt(); //no. of months
		    System.out.println(m*x<y?"Yes":"No");
		}
	}
}
