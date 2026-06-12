import java.util.Scanner;
class IntDo
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the integer : ");
		int a = sc.nextInt();
		double b = a;
		System.out.println("int to double: "+b);
		
		
		System.out.print("enter double: ");
		double c= sc.nextDouble();
		byte d = (byte)c;
		System.out.println("int to byte ex: "+d);
		
		
		System.out.print("enter the integer : ");
		int f = sc.nextInt();
		byte e = (byte)f;
		System.out.println("int to byte ex: "+e);
		
		
		Scanner ob = new Scanner(System.in);
		System.out.print("enter the char: ");
		char ch = ob.next().charAt(0);
		int as = ch;
		System.out.println("enter the ascii: "+as);
	}
}
