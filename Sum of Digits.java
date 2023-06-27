// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for (int i = 0; i < t; i++) {
		    int n = scanner.nextInt();
		    
		    int sum = 0;
		    
		    while (n != 0) {
		        sum  += n % 10;
		        n /= 10;
		    }
		    
		    System.out.println(sum);
		}
    }
}
