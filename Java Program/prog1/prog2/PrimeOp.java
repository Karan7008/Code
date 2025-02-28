import java.util.Scanner;
class PrimeOp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i=1,fact=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				fact=fact+1;
			}
			i++;
		}
		if (fact==2)
		{
			System.out.println(n + "  is a prime number");
		}
		else
		{
			System.out.println(n + " is  a composit number");
		}
	}
}