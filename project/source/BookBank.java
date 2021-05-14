import Books.*;
import Librarian.*;
import Member.*;
import java.util.*;
import java.io.*;
import java.text.*;
public class BookBank
{

	public List<User> users;
	public List<Book> books;
	public librarian l;
	
	public int matchBook(int bookID)
	{
		for(int i=0;i<books.size();i++)
		{
			if(bookID==(books.get(i).id))
				return i;
		}
		return -1;
	}
	//change
	public int matchUser(int userID) 
	{
		for(int i=0;i<users.size();i++)
		{
			if(userID==(users.get(i).mem_id))
				return i;
		}
		return -1;
	}

	public void liblogin()
	{
		int ch,r,intch;
		Scanner obj = new Scanner(System.in);
		String name;String author;int edition;double price;String t;
		do
		{
			System.out.print("choose\n 1.Manage Books\n 2.Manage Users\n 3.Edit personal details\n 4.Inbox\n 5.Logout\n choice : ");// 1.Add Book \n 2.remove Book \n 3.view Inbox \n 4. clear Inbox \n 5.Check Book \n 6.Set trust value\n 7.remove User \n 8.exit");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1 :do
						{
							System.out.print("choose\n 1.Add Books\n 2.Remove Book\n 3.check Book\n 4.Back\n choice : ");
							intch=obj.nextInt();
							switch(intch)
							{
								case 1 :System.out.print("Enter Name   : ");
										name=obj.next();
										System.out.print("Enter Author : ");		
										author=obj.next();
										System.out.print("Enter	Edition: ");
										edition=obj.nextInt();
										System.out.print("Enter type   : ");		
										t=obj.next();
										System.out.print("Enter	price  : ");
										price=obj.nextDouble();
										books.add(new Book(name,author,edition,price,t));
										books.get(books.size()-1).setId(books.size());
										books.get(books.size()-1).setStatus("Available");
										System.out.print("Enter Rack_No: ");
										r=obj.nextInt();
										books.get(books.size()-1).setRack_no(r);
										System.out.print("Enter Quantity : ");
										int q=obj.nextInt();
										books.get(books.size()-1).setQty(q);
										if(q==0)
										{
											books.get(books.size()-1).setStatus("Unavailable");	
										}									
										System.out.println("the following book has successfully been Added");
										books.get(books.size()-1).BookDisplay();
										break;
								case 2 :System.out.print("Enter book ID : ");
										r=obj.nextInt();
										r=matchBook(r);
										if(r>=0)
										{
											books.remove(r);
										}
										else
										System.out.println("Book not found");
										break;
								case 3 :System.out.print("Enter book ID : ");
										r=obj.nextInt();
										r=matchBook(r);
										if(r>-1)
										{
											books.get(r).BookDisplay();
										}
										else
										System.out.println("Book not found");
										break;
								case 4 :break;
								default:System.out.println("Invalid");
							}
						}while(intch!=4);
						break;
				case 2 :do
						{
							System.out.print("choose\n 1.View User\n 2.Remove User\n 3.Update user\n 4.Back\n choice : ");
							intch=obj.nextInt();
							switch(intch)
							{
								case 1 :System.out.println("Enter Member Id : ");
										r=obj.nextInt();
										r=matchUser(r);	
										if(r>-1)
										{
											users.get(r).UserDisplay();
										}	
										else
										System.out.println("User not Found");
										break;
								case 2 :System.out.println("Enter Member Id : ");
										r=obj.nextInt();
										r=matchUser(r);	
										if(r>-1)
										{
											users.remove(r);
										}	
										else
										System.out.println("User not Found");
										break;
								case 3 :System.out.println("Enter Member Id : ");
										r=obj.nextInt();
										r=matchUser(r);	
										if(r>-1)
										{
											System.out.print("Enter trust value[1/0] : ");
											users.get(r).setTrust(obj.nextInt());
											System.out.print("Enter Pending Fine : ");
											users.get(r).setFine(obj.nextDouble());
										}	
										else
										System.out.println("User not Found");
										break;
								case 4 :break;
								default:System.out.println("Invalid");
							}
						}while(intch!=4);
						break;
				case 3 :do
						{
							System.out.print("choose\n 1.Change PhoneNo\n 2.Change UserId\n 3.Change Password\n 4.Back\n choice : ");
							intch=obj.nextInt();
							switch(intch)
							{
								case 1 :System.out.print("Enter phone Number : ");
										l.setPhone_No(obj.next());
										break;
								case 2 :System.out.print("Enter New UserID : ");
										l.setUserId(obj.nextInt());
										break;
								case 3 :System.out.print("Enter New PassWord : ");
										l.setPass(obj.next());
										break;
								case 4 :break;
								default:System.out.println("Invalid");
							}
						}while(intch!=4);
						break;
				case 4 :do
						{
							System.out.print("choose\n 1.View Inbox\n 2.Clear Inbox\n 3.back\n choice : ");
							intch=obj.nextInt();
							switch(intch)
							{
								case 1 :l.viewmsg();
										break;
								case 2 :for(int i=0;i<l.inbox.size();i++)
										{
											l.inbox.remove(i);	
										}
										break;
								case 3 :break;
								default:System.out.println("Invalid");
							}
						}while(intch!=3);
						break;
				case 5 :break;
				default:System.out.println("Invalid");
			}
		}while(ch!=5);
	}
	public void usrlogin(User usr)
	{
		int ch,r,intch;
		Scanner obj = new Scanner(System.in);
		String name;String author;int edition;double price;String t;
		do
		{
			System.out.print("choose\n 1.Borrow Book\n 2.Return Book\n 3.Check Membership\n 4.Edit personal details\n 5.Inbox\n 6.Logout\n choice : ");// 1.Add Book \n 2.remove Book \n 3.view Inbox \n 4. clear Inbox \n 5.Check Book \n 6.Set trust value\n 7.remove User \n 8.exit");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1 :System.out.print("Enter Book ID : ");
						r=obj.nextInt();
						r=matchBook(r);
						if(r>-1)
						{
							books.get(r).BookDisplay();
							System.out.println("Do yo want to borrow it ?");
							char reply=obj.next().charAt(0);
							if(reply=='y')
							{
								if(!(usr.nbooks_issued==usr.max_book_limit))
								{
									if(books.get(r).quantity>0)
									{
										System.out.println("Book Borrowed");
										books.get(r).quantity-=1;
										if(books.get(r).quantity==0)
										{
											books.get(r).setStatus("Unavailable");
										}
									}
									usr.incrementNBooks(books.get(r).id);
								}
								else
								{
									System.out.println("Max Book limit");
								}
							}
							else 
							{
								System.out.println("Come again");
							}
						}
						else
						System.out.println("Book not found");
						break;
				case 2 :System.out.print("Enter Book ID : ");
						r=obj.nextInt();
						r=matchBook(r);
						Date bd,cd;
						long millis=System.currentTimeMillis();
						cd=new Date(millis);
						if(r>-1)
						{
							books.get(r).BookDisplay();
							System.out.println("Do yo want to return it ?");
							char reply=obj.next().charAt(0);
							int flag=0;
							if(reply=='y')
							{
								for(int i=0;i<usr.books_Borrowed.size();i++)
								{
									if(books.get(r).id==usr.getBook(i))
									{
										bd=usr.getDate(i);
										flag=1;
										String s1=new String();
										DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
										String strDate = dateFormat.format(cd);
										s1=dateFormat.format(bd);
										int x=Character.getNumericValue(s1.charAt(5));
										int y=Character.getNumericValue(s1.charAt(6));
										int month1=x*10+y;
										int a=Character.getNumericValue(s1.charAt(8));
										int b=Character.getNumericValue(s1.charAt(9));
										int date1=a*10+b;
										
										System.out.println(" "+strDate);
										 x=Character.getNumericValue(strDate.charAt(5));
										 y=Character.getNumericValue(strDate.charAt(6));
										int month2=x*10+y;
										a=Character.getNumericValue(strDate.charAt(8));
										b=Character.getNumericValue(strDate.charAt(9));
										int date2=a*10+b;
										int n=0;
										if(date1>=date2)
										{
											n+=date2;
											n+=30-date1;
											n+=(month2-month1-1)*30;
										}
										
											System.out.println("You Have returned after "+n +" Days.");
										if(n>15)
										{
											usr.setFine((n-15)*10);
											
										}
									}
								}
								if(flag==1)
								{
									System.out.println("Book Returned");
									books.get(r).quantity+=1;
									if(books.get(r).quantity-1==0)
									{
										books.get(r).setStatus("Available");
									}
									usr.decrementNBooks(books.get(r).id);
								}
								else
								{
									System.out.println("Book Not Borrowed");
								}
							}
						}
						else
						System.out.println("Book not found");
						break;
				case 3 :usr.UserDisplay();
						break;
				case 4 :do
						{
							System.out.print("choose\n 1.Change PhoneNo\n 2.Change UserId\n 3.Change Password\n 4.Back\n choice : ");
							intch=obj.nextInt();
							switch(intch)
							{
								case 1 :System.out.print("Enter phone Number : ");
										usr.setPhone_No(obj.next());
										break;
								case 2 :System.out.print("Enter New UserID : ");
										usr.setUserId(obj.nextInt());
										break;
								case 3 :System.out.print("Enter New PassWord : ");
										usr.setPass(obj.next());
										break;
								case 4 :break;
								default:System.out.println("Invalid");
							}
						}while(intch!=4);
						break;
				case 5 :do
						{
							System.out.print("choose\n 1.View Inbox\n 2.Clear Inbox\n 3.back\n choice : ");
							intch=obj.nextInt();
							switch(intch)
							{
								case 1 :usr.viewmsg();
										break;
								case 2 :for(int i=0;i<usr.inbox.size();i++)
										{
											usr.inbox.remove(i);	
										}
										break;
								case 3 :break;
								default:System.out.println("Invalid");
							}
						}while(intch!=3);
						break;
				case 6 :break;
				default:System.out.println("Invalid");
			}
		}while(ch!=6);
	}
	public static void main(String Args[])
	{
		BookBank b=new BookBank();
		try
		{
			FileInputStream fis = new FileInputStream("users.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			b.users = (List<User>) ois.readObject();
			ois.close();
		}
		catch(Exception e)
		{
			b.users=new ArrayList<User>();	
			System.out.println("newly created:Users");
		}
		try
		{
			FileInputStream fis = new FileInputStream("books.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			b.books = (List<Book>) ois.readObject();
			ois.close();
		}
		catch(Exception e)
		{
			b.books=new ArrayList<Book>();	
		}
		try
		{
			FileInputStream fis = new FileInputStream("lib.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			b.l = (librarian) ois.readObject();
			ois.close();
		}
		catch(Exception e)
		{}		
		Scanner obj=new Scanner(System.in);
		int userId;String pass;
		int flag=0;
		char choice;
		System.out.println("Hello. Welcome to Our BookBank");
		do
		{
			System.out.print("Existing User (or) New User [e|n]");
			choice=obj.next().charAt(0);
			if(choice=='e')
			{
				System.out.print("Enter User ID  : ");
				userId=obj.nextInt();
				System.out.print("Enter Password : ");		
				pass=obj.next();
				if(userId==b.l.user_id)
				{
					if(pass.equals(b.l.password))
					{
						flag=1;
						System.out.println("Librarian");
						b.liblogin();
					}
				}
				else if(b.matchUser(userId)>=0)
				{
					int k;
					k=b.matchUser(userId);
					if(pass.equals(b.users.get(k).password))
					{
						flag=1;
						System.out.println("You Are a user");
						b.usrlogin(b.users.get(k));
					}
					else
					System.out.println("Pass mismatchUser");
				}
				if(flag==0)
				{
					System.out.println("Invalid");
				}
				flag=0;

			}
			else if(choice=='n')
			{
				String n;String a;String t;String p;String pas;int mid;
				System.out.print("Enter Name  : ");
				n=obj.next();
				System.out.print("Enter Password : ");		
				pas=obj.next();//change
				System.out.print("Enter	Address  : ");
				a=obj.next();
				System.out.print("Enter type : ");		
				t=obj.next();
				System.out.print("Enter	Phone Number  : ");
				p=obj.next();
				mid=b.users.size();//change
				b.users.add(new User(n,a,t,p,pas,mid));
				System.out.println("Updated Successfully");
				b.users.get(b.users.size()-1).UserDisplay();
			}
		}while(choice!='1');
		try
		{   //File f=new File("F:\\java\\project\\Filehandling\\\t.tmp");
			FileOutputStream fos = new FileOutputStream("users.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b.users);
			oos.close();
			//if(f.delete())
			//System.out.println("deleted");
		}
		catch(Exception e)
		{}
		try
		{   //File f=new File("F:\\java\\project\\Filehandling\\\t.tmp");
			FileOutputStream fos = new FileOutputStream("books.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b.books);
			oos.close();
			System.out.println("Saved succefully");
			//if(f.delete())
			//System.out.println("deleted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{   //File f=new File("F:\\java\\project\\Filehandling\\\t.tmp");
			FileOutputStream fos = new FileOutputStream("lib.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b.l);
			oos.close();
			System.out.println("Saved succefully");
			//if(f.delete())
			//System.out.println("deleted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
