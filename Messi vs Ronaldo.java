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
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int a = A*2+B;
		
		int b = X*2+Y;
		
		if(a>b)
		{
		    System.out.println("Messi");
		}
		else if(a==b)
		{
		    System.out.println("Equal");
		}
		else{
		    System.out.println("Ronaldo");
		}
	}
}
