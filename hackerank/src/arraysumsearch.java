
public class arraysumsearch {
	public static int arr[]={1,4,6,8,10,45};
	public static int size=6;
	public static int sum=16;
	public static int diff;
	
	public static boolean sumSearch(int arr[], int size, int sum)
	{
		for(int i=0;i<size;i++)
		{
			diff=Math.abs(arr[i]-sum);
			System.out.println("element is :"+arr[i]+"  difference is :"+diff);
			int pos=binarySearch(arr,0,size-1,diff);
			if(pos!=-1)
			System.out.println("other elemnet :"+pos);
		}
		return true;
	}

	private static int binarySearch(int[] arr2, int left, int right, int key) {
		// TODO Auto-generated method stub
		if(left<=right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==key)
				return arr[mid];
			else if(arr[mid]<key)
			{
				binarySearch(arr,mid+1,right,key);
			}
			else
				binarySearch(arr,left,mid-1,key);
		}
		return -1;
	}
	public static void main(String args[])
	{
		sumSearch(arr,6,16);
	}
}
