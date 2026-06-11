class Prime
{
	static boolean num(int a)
	{
		for(int i =2;i<a;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
			return true;
	}
	public static void main(String[]args)
	{
		int n=7;
		if(num(n))
		{
			System.out.println(n+"is a prime num");
		}
		else
		{
			System.out.println(n+"is not a prime num");
		}
	}
}
			
			