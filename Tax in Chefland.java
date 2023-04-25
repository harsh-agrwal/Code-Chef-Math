/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) {
	    Scanner scn =new Scanner(System.in);
	    int t=scn.nextInt();
	    for (int i=0;i<t;i++){
	        int x=scn.nextInt();
	        if (x>100){
	            System.out.println(x-10);
	        }else {System.out.println(x);
	        }
	    }
}}
