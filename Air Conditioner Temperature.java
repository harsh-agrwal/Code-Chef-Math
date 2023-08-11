/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test, Alice, Bob, Charlie;
        test = in.nextInt();
        while (test-- > 0) {
            Alice = in.nextInt();
            Bob = in.nextInt();
            Charlie = in.nextInt();
            if(Bob>=Alice && Bob>=Charlie){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		        }            
            }
        }
    }
