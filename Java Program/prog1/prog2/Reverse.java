import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int n, rev=0;
		n=num;
		while( n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of given number is  " + rev);
	}
}