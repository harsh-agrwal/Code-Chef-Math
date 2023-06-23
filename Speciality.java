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
	        int c=s.nextInt();
	        if(a>b && a>c)
	        System.out.println("Setter");
	        else if(b>a && b>c)
	        System.out.println("Tester");
	        else
	        System.out.println("Editorialist");
	    }
		// your code goes here
	}
}
