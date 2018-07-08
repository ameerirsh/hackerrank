
public class binarymultiples {
	
public static int binaryNumber=1001;

public static int convertToDecimal(int binaryNumber)
{
	int lastDigit;
	int decimal=0;
	int power=0;
	while(true)
	{
		if(binaryNumber==0)
			break;
		else
		{
			lastDigit=binaryNumber%10;
			decimal=(int) (decimal+lastDigit*Math.pow(2, power));
			binaryNumber=binaryNumber/10;
			power++;
		}
		
	}
	return decimal;
}

public static void main(String args[])
{
	System.out.println(convertToDecimal(1101));
	System.out.println(convertToDecimal(11));
	System.out.println(convertToDecimal(110));
	int val=convertToDecimal(1001);
	if(val%3==0)
	System.out.println("yes multiple");
}

}
