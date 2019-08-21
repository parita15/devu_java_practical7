import java.util.*;

public class LengthException extends Exception
{
	public LengthException()
	{
			System.out.println("Exception : Length should be proper ");
	}
		public static void main(String a[])
		{
			Scanner s=new Scanner(System.in);
				String uname;
				System.out.print("Enter Username = ");
				uname=s.next();
			try
			{


				if(uname.length() < 4 && uname.length() > 10)
						throw new LengthException();
			}
			catch(LengthException e)
			{
				System.out.println("Exception : Length should be proper "+e);
			}
			finally
			{
				System.out.println("Done..");
			}

		}
}