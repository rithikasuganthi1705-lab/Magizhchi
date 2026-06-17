class LinearSearch
{
	public static void main(String[]args)
	{
		int a [] = {10,20,30,40,50};
		int targ = 30;
		LinearSearch ls = new LinearSearch();
		int res = ls.linearCheck(a,targ);
		System.out.println("ined value: "+res);
		
		
	}
	
	
	int linearCheck(int a [] , int targ)
	{
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==targ)
			{
				return i;
			}
		}
			return -1;
		
	}
}