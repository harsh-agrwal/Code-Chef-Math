/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=0;i<n;i++){
	        int a=s.nextInt();
	        int b=s.nextInt();
	        int c=a*b;
	        int d=c/4;
	        if(c%4!=0)
	        System.out.println(d+1);
	        else
	        System.out.println(d);
	    }
		// your code goes here
	}
}
