import java.util.Scanner;
class OddEven
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("the num is even");
		}
		else
		{
			System.out.println("the num is odd");
		}
	}
}

			