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
		for(int i=0;i<T;i++)
		{
		   //Your Code Goes Here
		   int a = in.nextInt();
		   System.out.println((a%2==0 && a%7 == 0)?"Alice":(a%2!=0 && a%9 == 0)?"Bob":"Charlie");
		}
		
	}
}
