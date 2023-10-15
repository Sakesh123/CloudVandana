import java.util.*;
public class RomanToInteger
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] charArray = new char[]{'I','V','X','L','C','D','M'};
		System.out.print("Enter Roman number : ");
		String romanNumber=sc.next();
		int finalValue=0;
		int prev=0;
		for(int i=romanNumber.length()-1;i>=0;i--)
		{
			int current=0;
			if(romanNumber.charAt(i)=='I')
			{
				current=1;
			}
			if(romanNumber.charAt(i)=='V')
			{
				current=5;
			}
			if(romanNumber.charAt(i)=='X')
			{
				current=10;
			}
			if(romanNumber.charAt(i)=='L')
			{
				current=50;
			}
			if(romanNumber.charAt(i)=='C')
			{
				current=100;
			}
			if(romanNumber.charAt(i)=='D')
			{
				current=500;
			}
			if(romanNumber.charAt(i)=='M')
			{
				current=100;
			}
			if(current<prev)
			{
				finalValue-=current;
			}
			else
			{
				finalValue+=current;
			}
			prev=current;
		}
		System.out.println("Integer number after converting Roman number :"+finalValue);
	}
}