class Lar
{
	public static void main(String[]args)
	{
		
		int arr[][] = {{1,8,3},{4,2,6}};
		int largeamt = arr[0][0];
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]>largeamt)
				{
				largeamt = arr[i][j];
				}
			}
		}
			System.out.println("largest: "+largeamt);
		
	}
}