
public class StringUniqueChars {


public static boolean checkUnique(String str)
{
	boolean[] char_set=new boolean[256];
	//for(int j=0;j<char_set.length;j++)
		//System.out.println(char_set[j]);
	for(int i=0;i<str.length();i++)
	{   
		int val=str.charAt(i);
		System.out.println(val);
		if(char_set[val]) 
			{
			
			return false;
			}
		System.out.println(char_set[val]);
		char_set[val]=true;
		
	}
	return true;
}


public static void main(String args[])
{
	String str="hello";
	if(checkUnique(str))
		System.out.println("unique");
	else
		System.out.println("not unique");
	
}



}
