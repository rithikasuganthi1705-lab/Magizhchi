class Fib
{
	static void fib(int n)
	{
		int a = 0, b = 1;
		System.out.println("Fibonacci: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[]args)
	{
		fib(5);
	}
}