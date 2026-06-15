class Dsaa
{
	public static void main(String[]args)
	{
		Dsaa ds = new Dsaa();
		int a = 500;
		System.out.println("before func: "+a);
		ds.passByValue(a);
		System.out.println("after func: "+a);

		
	}
	void passByValue(int n)
	{
		int a = 1000;
		System.out.println("Inside func: "+a);	
	}
}

		
		