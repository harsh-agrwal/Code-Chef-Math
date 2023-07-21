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
		int T=sc.nextInt();
		while(T!=0){
		    T--;
		    int R1=sc.nextInt();
		    int R2=sc.nextInt();
		    int R3=sc.nextInt();
		    if(R1+R2<R3 || R2+R3<R1 || R3+R1<R2)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
