import java.util.Scanner;
class Qudratic
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values for qudratric equation a ,b , c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a!=0)
		{
			int qdt=-b+ sqrt(b*b - 4 * a * c)/2*a;
			int qdt2=-b - sqrt(b*b -4 * a *c)/2*a;
		}
		System.out.println(qdt + "  " + qdt2);
	}
}