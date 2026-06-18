class Bubble
{
	public static void main(String[]args)
	{
		int ar [] = {5,1,4,2,8,3};
		Bubble b = new Bubble();
		int [] sort = b.sorting(ar);
		for(int i=0;i<sort.length;i++)
		{
			System.out.print(sort[i]+" ");
		}
	}
	
	int [] sorting(int ar [])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j+1]<ar[j])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}
}