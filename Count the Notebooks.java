/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int i;
		for(i=1;i<=T;i++)
		{
		    int N=in.nextInt();
		    int nop=N*1000;
		    int non=nop/100;
		    System.out.println(non);
		}
	}
}
