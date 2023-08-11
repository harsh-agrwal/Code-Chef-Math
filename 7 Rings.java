/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int n = read.nextInt();
		    int x = read.nextInt();
		    int d = n * x;
		    int count = 0;
		    int c = d;
		    while(c%10>=0){
		        count = count + 1;
		        c = c / 10;
		        if(c==0){
		            break;
		        }
		    }
		    if(count==5){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
