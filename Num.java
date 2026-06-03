import java.util.Scanner;
class num
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		if(number >0)
		{
			System.out.println("the number is positive");
		}
		else if(number < 0)
		{
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("NO DATA");
		}
	}
}

			
			