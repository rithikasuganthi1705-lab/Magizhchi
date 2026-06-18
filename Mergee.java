import java.util.Arrays;
class Mergee
{
	public static void main(String[]args)
	{
		int ar [] = {10,3,7,1,9,4,8};
		Mergee m = new Mergee();
		int sort [] = m.divide(ar);
		for(int i=0;i<sort.length;i++)
		{
			System.out.print(sort[i]+" ");
		}
	}
	
	int [] divide(int ar[])
	{
		if(ar.length==1)
		{
			return ar;
		}
		int mid = ar.length/2;
		int left [] = divide(Arrays.copyOfRange(ar,0,mid));
		int right [] = divide(Arrays.copyOfRange(ar,mid,ar.length));
		return merge(left,right);
	}
	int [] merge(int left [],int right[])
	{
		int i =0;
		int j=0;
		int k=0;
		int newA [] = new int [left.length+right.length];
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				newA[k]=left[i];
				i++; 
				k++;
			}
			else
			{
				newA[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newA[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newA[k]=right[j];
				j++;
				k++;
		}
		return newA;
	}
}

			
				
		