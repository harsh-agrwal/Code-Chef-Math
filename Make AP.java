/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0){
		    int x=scn.nextInt(),y=scn.nextInt();
		    if((x+y)%2==0) System.out.println((x+y)/2);
		    else System.out.println(-1);
		}
	}
}
