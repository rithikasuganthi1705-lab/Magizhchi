class Max
{
	public static void main(String[]args)
	{
		int price [] = {2500,785,98,6453,13};
		int maxamt = price[0];
		for(int i=0;i<price.length;i++)
		{
			if(price[i]>maxamt)
			{
				maxamt = price[i];
			}
		}
		System.out.println(maxamt);
	}
}

			
			