package Librarian;
import java.util.*;
import java.io.*;
public class librarian implements Serializable
{
	public String name,addr,phone_no,password;
	public List<String> inbox;
	public int user_id; 
	public librarian(String a,String b,String c,String d,int e)
	{
		name=a;
		addr=b;
		phone_no=c;
		password=d;
		user_id=e;
		inbox=new ArrayList<String>();
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
		user_id=p;
	}
	public void appendMsg(String s)
	{
		inbox.add(s);
	}	
	public void viewmsg()
	{
		for(int i=0;i<inbox.size();i++)
		{
			System.out.println(inbox.get(i)+"\n");
		}
	}
}