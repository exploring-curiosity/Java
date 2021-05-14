package Books;
import java.util.*;
import java.io.*;
public class Book implements Serializable 
{
	public String name,author,description,status,type;
	public int id,rack_no,edition,quantity;			
	public double price;
	public Date d;
	public void setdate()
	{
		long millis=System.currentTimeMillis();
		d=new Date(millis);		
	}
	public Book(String name,String author,int edition,double price,String t)
	{
		this.name=name;
		this.author=author;
		this.edition=edition;
		this.price=price;
		type=t;
		setdate();
	}
	public void setQty(int q)
	{
		quantity=q;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setDesp()
	{
		System.out.println("Enter Description.");
		Scanner obj=new Scanner(System.in);
		description=obj.next();
	}
	public void setStatus(String s)
	{
		status=s;
	}
	public void setRack_no(int a)
	{
		rack_no=a;
	}
	public void BookDisplay()
	{
		System.out.println("Book Details:");
		System.out.println("Name        : "+name);
		System.out.println("Author      : "+author);
		System.out.println("Edition     : "+edition);
		System.out.println("Price       : "+price);
		System.out.println("Description : "+description);
		System.out.println("Id          : "+id);
		System.out.println("Rack number : "+rack_no);
		System.out.println("Status      : "+status);
		System.out.println("Quantity	: "+quantity);
		System.out.println("Date        : "+d);
	}
}