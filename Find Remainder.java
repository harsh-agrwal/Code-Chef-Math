import java.util.Scanner;

class Find_remainder
{
	public static void main(String args[])
	{
		int test=0,divi=0,numb=0;
		int i=0,rema=0;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(i=0;i<test;i++)
		{
			numb=sc.nextInt();
			divi=sc.nextInt();
			rema=numb%divi;
			System.out.println(rema);
		}
	}
}
