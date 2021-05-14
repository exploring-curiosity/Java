import java.util.Scanner;
class StackFullException extends Exception
{
	public String toString()
	{
		return "Exception caught : stack is full";
	}
}

class StackEmptyException extends Exception
{
	public String toString()
	{
		return "Exception caught : stack is Empty";
	}
}
class stack<T>
{
	T ele[];
	int top,size;
	stack(int a)
	{
		
		size=a;
		top=-1;
		System.out.println("Stack Initialized"); 	
	}
	void push(T x) throws StackFullException
	{
		if(top==size-1)
			throw new StackFullException();
		else
			ele[++top]=x;
	}
	T pop() throws StackEmptyException
	{
		if(top==-1)
		{
			throw new StackEmptyException();
		}
		else
		{
			top--;
			return ele[top+1];
		}
	}
	void Display() throws StackEmptyException
	{
		if(top==-1)
			throw new StackEmptyException();
		for(int i=0;i<=top;i++)
		{
			System.out.println(ele[i]);
		}
	}
		
}
public class GenericStack
{
	public static void main(String Args[])
	{
		Scanner obj = new Scanner(System.in);
		int a,n,x;
		int ch;		
		do
		{
		System.out.println("1.String\n2.Integer\n3.Double\n4.Exit");
		x=obj.nextInt();	
		
		switch(x)
		{	
			case 1 :System.out.print("Enter the Size of stack : ");
				a=obj.nextInt();
				String q=new String();		
				stack<String> s=new stack<String>(a);
				s.ele=new String[a];
				
				do
				{
					System.out.println("Enter option:\n 1.insert \n 2.delete\n 3.Display\n 4.exit");
					ch=obj.nextInt();	
					switch(ch)
					{
						case 1 :System.out.print("Enter String : ");
							q=obj.next();
							
							try{					
							s.push(q);}
							catch(StackFullException e)
							{
								System.out.println(e);
							}					
							break;
						case 2 :try{					
							q=s.pop();}
							catch(StackEmptyException e)
							{
								System.out.println(e);
							}
							finally
							{	
								System.out.println("Deleted : ");
							}	
							break;
						case 3 :try{
								s.Display();
							}
							catch(StackEmptyException e)
							{
								System.out.println(e);
							}	
							break;
						case 4 :break;
						default:System.out.println("Invalid Option");
					}
				}while(ch!=4);
				break;
			case 2 :System.out.print("Enter the Size of stack : ");
				a=obj.nextInt();
				int q1;		
				stack<Integer> s1=new stack<Integer>(a);
				s1.ele=new Integer[a];
				do
				{
					System.out.println("Enter option:\n 1.insert \n 2.delete\n 3.Display\n 4.exit");
					ch=obj.nextInt();	
					switch(ch)
					{
						case 1 :System.out.print("Enter Number : ");
							q1=obj.nextInt();
							
							try{					
							s1.push(q1);}
							catch(StackFullException e)
							{
								System.out.println(e);
							}					
							break;
						case 2 :try{					
							q1=s1.pop();}
							catch(StackEmptyException e)
							{
								System.out.println(e);
							}
							finally
							{	
								System.out.println("Deleted : ");
							}	
							break;
						case 3 :try{
								s1.Display();
							}
							catch(StackEmptyException e)
							{
								System.out.println(e);
							}	
							break;
						case 4 :break;
						default:System.out.println("Invalid Option");
					}
				}while(ch!=4);
				break;
			case 3 :System.out.print("Enter the Size of stack : ");
				a=obj.nextInt();
				double q3;		
				stack<Double> s3=new stack<Double>(a);
				s3.ele=new Double[a];
				do
				{
					System.out.println("Enter option:\n 1.insert \n 2.delete\n 3.Display\n 4.exit");
					ch=obj.nextInt();	
					switch(ch)
					{
						case 1 :System.out.print("Enter String : ");
							q3=obj.nextDouble();
							
							try{					
							s3.push(q3);}
							catch(StackFullException e)
							{
								System.out.println(e);
							}					
							break;
						case 2 :try{					
							q3=s3.pop();}
							catch(StackEmptyException e)
							{
								System.out.println(e);
							}
							finally
							{	
								System.out.println("Deleted : ");
							}	
							break;
						case 3 :try{
								s3.Display();
							}
							catch(StackEmptyException e)
							{
								System.out.println(e);
							}	
							break;
						case 4 :break;
						default:System.out.println("Invalid Option");
					}
				}while(ch!=4);
				break;
			case 4 :break;
			default:System.out.println("Invalid option");	
		}
		}while(x!=4);
	}
}
