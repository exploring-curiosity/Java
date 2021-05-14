package Member;
import java.util.*;
import java.io.*;
class lend
{
	public int bid;
	public Date d;
	public void setdate()
	{
		long millis=System.currentTimeMillis();
		d=new Date(millis);		
	}
	lend(int a,Date dat)
	{
		bid=a;
		d=dat;
	}
}
public class User implements Serializable
{
	public String name,addr,type,phone_no,password;
	public int mem_id,trust_value,max_book_limit,nbooks_issued;
	public Date d;
	public double fine;
	public List<String> inbox;
	public List<lend> books_Borrowed;
	public void setdate()
	{
		long millis=System.currentTimeMillis();
		d=new Date(millis);		
	}
	public User(String n,String a,String t,String p,String pass,int mid)
	{
		name=n;
		addr=a;
		type=t;
		phone_no=p;
		password=pass;
		mem_id=mid;
		trust_value=0;
		nbooks_issued=0;
		max_book_limit=3;
		if(type.equals("Bronze"))
		{
			max_book_limit=3;
		}
		if(type.equals("Silver"))
		{
			max_book_limit=4;
		}
		if(type.equals("Gold"))
		{
			max_book_limit=5;
		}
		inbox= new ArrayList<String>();
		books_Borrowed=new ArrayList<lend>();
		fine=0.0;
		inbox.add("Welcome "+name+".You are now a "+type+" member"+".Thank for choosing our Book Bank.");
		setdate();
	}
	public void viewmsg()
	{
		for(int i=0;i<inbox.size();i++)
		{
			System.out.println(inbox.get(i)+"\n");
		}
	}
	public void setTrust(int a)
	{
		if(trust_value<a)
		{
			max_book_limit+=1;
		}
		else if(trust_value>a)
		{
			max_book_limit-=1;
		}
		trust_value=a;
	}
	public void setFine(double f)
	{
		fine=f;
		Date curdate;
		long millis=System.currentTimeMillis();
		curdate=new Date(millis);
		inbox.add("Your fine amount is updated on "+curdate+".Please contact librarian if not relevent.");
	}
	public void appendMsg(String s)
	{
		inbox.add(s);
	}
	public void incrementNBooks(int bid)
	{
		nbooks_issued++;
		Date curdate;
		long millis=System.currentTimeMillis();
		curdate=new Date(millis);	
		books_Borrowed.add(new lend(bid,curdate));
	}
	public int getBook(int i)
	{
		return books_Borrowed.get(i).bid;
	}
	public Date getDate(int i)
	{
		return books_Borrowed.get(i).d;
	}
	public void decrementNBooks(int bid)
	{
		nbooks_issued--;
		int i;
		lend z=new lend(0,d);
		for(i=0;i<books_Borrowed.size();i++)
		{
			if(books_Borrowed.get(i).bid==bid)
			{
				z=books_Borrowed.get(i);
				books_Borrowed.remove(i);
			}
		}
		System.out.println("Book Id : "+bid);
		System.out.println("Date Borrowed : "+z.d);
		inbox.add("You have returned you book "+bid+" on "+z.d+ ".");
	}
	public void setPhone_No(String ph)
	{
		phone_no=ph;
	}
	public void setPass(String p)
	{
		password=p;
	}
	public void setUserId(int p)
	{
		mem_id=p;
	}
	public void UserDisplay()
	{
		System.out.println("User Details:");
		System.out.println("Name        : "+name);
		System.out.println("Address     : "+addr);
		System.out.println("Type        : "+type);
		System.out.println("Phone Number: "+phone_no);
		System.out.println("Member ID   : "+mem_id);
		System.out.println("Trust Value : "+trust_value);
		System.out.println("Max Book Limit : "+max_book_limit);
		System.out.println("No of books Borrowed : "+nbooks_issued);
		System.out.println("Fine	: "+fine);
		System.out.println("Date of enroll : "+d);
		System.out.println("Books Borrowed :");
		int i;
		if(books_Borrowed.size()>0)
		{
			for(i=0;i<books_Borrowed.size();i++)
			{
				System.out.println(books_Borrowed.get(i).bid + " borrowed on " + books_Borrowed.get(i).d);
			}
		}
	}
}
