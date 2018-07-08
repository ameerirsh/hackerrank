
public class BinarySearch {
	public static int arr[]={1,4,7,9,12,15,23,26};
	//public static int arr[]={23,26,1,4,7,9,12,15};
	static int left=0;
	
	static int right = arr.length-1;
	
	static int mid;
	static int num = 23;
	public static int binarySearchIterative()
	{
		int pos=0;
		while(left<=right)
		{
			mid= left + (right-left)/2;
			//System.out.println(" value of mid: "+mid);
			if(arr[mid] == num)
				return mid;
			
			else if (arr[mid] < num)
			{
				left=mid+1;
			}
			else 
			{
				right=mid-1;
			}
		}
		return -1;
	
	}
	
public static int binarySearchRecursive(int arr[], int left, int right, int num)
{
	if(left<=right)
	{
		int mid=left + (right-left)/2;
		if(arr[mid] == num)
			return mid+1;
		else if(arr[mid] < num)
			return binarySearchRecursive(arr, mid+1,right,num);
		else
			return binarySearchRecursive(arr,left,mid-1,num);
	}
	return -1;
}
	
	
public static void main(String args[])
{
	//int arr[]={1,4,7,9,12,15,23,26};
	int arr[]={5, 7, 7, 8, 8, 10};
	int res=binarySearchIterative();
	//System.out.println("position  is : "+res);
	res=binarySearchRecursive(arr,0,arr.length-1, 8);
	System.out.println("position  is : "+res);
	int arr1[]={0,0,0,8,9,10};
	res=binarySearchRecursive(arr1,0,arr1.length-1, 8);
	System.out.println("position  is : "+res);
}
	
	

}
