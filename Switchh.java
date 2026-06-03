import java.util.Scanner;

class Switchh
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weekday : ");
		String day = sc.nextLine();
		
		
		switch(day)
		{
			case "monday" : 
			{
				System.out.println("1-->MONDAY");
				break;
			}
			case "tuesday" : 
			{
				System.out.println("2-->TUESDAY");
				break;
			}
			case "wednesday" : 
			{
				System.out.println("3-->WEDNESDAY");
				break;
			}
			case "thursday" : 
			{
				System.out.println("4-->THURSDAY");
				break;
			}
			case "friday" : 
			{
				System.out.println("4-->FRIDAY");
				break;
			}
			case "saturday" : 
			{
				System.out.println("4-->SATURDAY");
				break;
			}
			case "sunday" : 
			{
				System.out.println("4-->SUNDAY");
				break;
			}
			default :
			{
				System.out.println("NO WEEKDAY");
			}
		}
	}
}
				