import java.util.Scanner;
class ATM
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int dep,witdraw,balance=100000;
		do
		{
			System.out.println(" A T M ");
			System.out.println("Choose 1 for deposit: ");
			System.out.println("Choose 2 for withdraw:");
			System.out.println("Choose 3 for check balance:");
			System.out.println("Choose 4 for Exit:");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:	System.out.println("Enter your deposit amount:");
						 dep=sc.nextInt();
						balance=balance+dep;
						break;
				case 2:	System.out.println("Enter your withdraw amount:");
						int with=sc.nextInt();
						if(with<=balance)
						{
							balance=balance-with;
							System.out.println("Please collect your case");
						}
						else
						{
							System.out.println("Insufficient balance.......!!!!!");
						}
						break;
				case 3:	System.out.println("Your current balance is " + balance);
						break;
				case 4:	System.exit(0);
				default:	System.out.println("Invalid choice....!!!!");
			}
		} while(true);
	}
}