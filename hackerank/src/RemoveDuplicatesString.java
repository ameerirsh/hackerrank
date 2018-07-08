
public class RemoveDuplicatesString {
	public static boolean[] char_set=new boolean[256];
	public static void main(String args[])
	{
		String str="institute of technology";
		removeDuplicates(str);
	}
	

	private static void removeDuplicates(String str) {
		// TODO Auto-generated method stub
		StringBuilder newstr=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			boolean isDup=isDuplicate(str.charAt(i));
			if(!isDup)
			{
				
				System.out.println(str.charAt(i)+"  is duplicate");
			}
			
			else
			{
				newstr.append(str.charAt(i));
				System.out.println(str.charAt(i)+"  is not duplicate");
			}
		}
		System.out.println(newstr);
		
	}

	private static boolean isDuplicate(char c) {
		// TODO Auto-generated method stub
		
	//	for(int i=0;i<char_set.length;i++)
		{
			int val=c;
			//System.out.println("received :  "+c +" val is :"+val);
			if(char_set[val])
			{
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}
}
