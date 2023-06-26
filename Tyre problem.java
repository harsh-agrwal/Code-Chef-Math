/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s1=new Scanner(System.in);
	    int n=s1.nextInt();
	    while(n>0){
	        int x=s1.nextInt();
	        int y=s1.nextInt();
	        System.out.println(x*2+y*4);
	        n--;
	    }
	}
}
