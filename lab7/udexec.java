import java.util.*;
class LengthException extends Exception
{
			public LengthException(String uname)
			{
				if(uname.length() < 4 && uname.length() > 10)
					System.out.println("Sorry");
				else
					System.out.println("User Name = "+uname);
			}
}
class AlphaException extends Exception
{
			public AlphaException(String uname)
			{
				for(int i=0;i<uname.length();i++)
				{
					char c=uname.charAt(i);
				if(!(c >= 'A' && c<='Z') && !(c >= 'a' && c<='z'))
					System.out.println("Sorry");
				else
					System.out.println("User Name = "+uname);
				}
			}
}
public class udexec
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);


		try
		{
				String uname;
				System.out.print("Enter Username = ");
				uname=s.next();
				throw new LengthException(uname);
				throw new AlphaException(uname);
		}
		catch(LengthException e)
		{
			System.out.println("Exception : Length should be proper "+e);
		}
		catch(AlphaException e)
		{
					System.out.println("Exception : Usern ame should be alphabetic "+e);
		}
		finally
		{
			System.out.println("Done..");
		}

	}
}