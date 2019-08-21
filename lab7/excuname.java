import java.util.*;
public class excuname
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.print("Enter Username = ");
			String uname=s.next();
			System.out.print("Enter Semester = ");
			int sem=s.nextInt();
			System.out.println("User Name = "+uname);
			if(sem<=0)
				throw new InputMismatchException();
			else
				System.out.println("Semester = "+sem);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception : Semester should have positive value "+e);
		}
		finally
		{
			System.out.println("Done..");
		}

	}
}