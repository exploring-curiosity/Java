import Librarian.*;
import java.util.*;
import java.io.*;
public class preAnalysis
{
	public static void main(String Args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Welcome to PreSetup Of BookBank Management");
		String name,addr,phone_no,password;
		int user_id;
		System.out.print("Enter Name  : ");
		name=obj.next();
		System.out.print("Enter Password : ");		
		password=obj.next();
		System.out.print("Enter	Address  : ");
		addr=obj.next();
 		System.out.print("Enter UserID : ");		
		user_id=obj.nextInt();
		System.out.print("Enter	Phone Number  : ");
		phone_no=obj.next();
		librarian l=new librarian(name,addr,phone_no,password,user_id);
		try
		{   //File f=new File("F:\\java\\project\\Filehandling\\\t.tmp");
			FileOutputStream fos = new FileOutputStream("lib.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(l);
			oos.close();
			System.out.println("Saved succefully");
			//if(f.delete())
			//System.out.println("deleted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("");
	}
}