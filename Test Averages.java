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
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    float add = (a+b)/2;
		    float add2 = (b+c)/2;
		    float add3 = (a+c)/2;
		    if(add>=35 && add2>=35 && add3>=35){
		        System.out.println("Pass");
		    }
		    else{
		        System.out.println("Fail");
		    }
		}
	}
}
