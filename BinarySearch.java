
class BinarySearch
{
	public static void main(String[]args)
	{
	
		int a [] = {2,5,8,12,16,23,38};
		int target = 16;
		BinarySearch bs = new BinarySearch();
		int res = bs.binaryCheck(a,target);
		System.out.println("index value: "+ res);
	}
	
	
	int binaryCheck(int a [],int target)
	{
		int start = 0;
		int mid = 0;
		int end = a.length;
		while(start<=end)
		{
			mid = (start+end)/2;
			if(a[mid]==target)
			{
				return mid;
			}
			else if(a[mid]<target)
			{
				start = mid+1;
			}
			else if(a[mid]>target)
			{
				end = mid-1;
			}
		}
		return -1;
	}
}
	