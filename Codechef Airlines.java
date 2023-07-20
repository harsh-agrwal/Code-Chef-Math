/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    if (Y <= 10*X ) {
		        System.out.println(Y*Z);
		        
		    } else {
		        System.out.println(10*X*Z);
		    }
		}
	}
}
