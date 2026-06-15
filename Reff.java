class Reff
{
	public static void main(String[]args)
	{
		Reff ds = new Reff();
	int a[]={10,20,30};
	System.out.println("before func: ");
	
	for(int i =0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
		System.out.println();
		ds.passByRef(a);
		System.out.println();
	}
	void passByRef(int a[])
	{
		 a[1] = 424;
		for(int i = 0; i<a.length;i++)
		{
		System.out.print("after func: "+a[i]);
		}
		System.out.println();
	}
}

		
			
		
	
	
		