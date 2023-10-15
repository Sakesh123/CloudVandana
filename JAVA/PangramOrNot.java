import java.util.*;
public class PangramOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		Set<Character> ts=new TreeSet<>();
		StringTokenizer st=new StringTokenizer(sentence);
		while(st.hasMoreTokens())
		{
			String dup=st.nextToken().toUpperCase();
			for(int i=0;i<dup.length();i++)
			{
				ts.add(dup.charAt(i));
			}
		}
		if(ts.size()==16)
		{
			System.out.println("The given sentence is Pangram");
		}
		else
		{
			System.out.println("The given sentence is not Pangram");
		}
		
	}
}