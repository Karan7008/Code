import java.util.Scanner;
class FactorOp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i + "\t ");
			}
			i++;
		}
	}
}