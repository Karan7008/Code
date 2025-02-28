import java.util.Scanner;
class Day
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of days:");
		int day=sc.nextInt();
		int year=day/365;
		int rday=day%365;
		int month=rday/30;
		rday=rday%30;
		
		System.out.println(year + "  Year" + month +"  Month" + rday +"  Days");
	}
}