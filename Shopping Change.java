/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); 
		while(T-->0) {
		    int x = in.nextInt(); 
		    System.out.println(x<=100?100-x:0);
		    
		}
	}
}
