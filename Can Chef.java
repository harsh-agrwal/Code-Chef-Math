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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  b=b*2;
      if(a*15>=b)
		  {
		    System.out.println("YES");
		  }
		  else
		  {
		    System.out.println("NO");
		  }
		}
	}
}
