/*1. Write a Java program to find the maximum value from the given type of elements using a
generic function.*/

import java.util.*;
class GenFunc<T>
{
		
	public <T extends Comparable<T>> T FindMax(T[] obj)
	{
		T max=obj[0];	
		for(int i=1;i<obj.length;i++)
		{
			if(obj[i].compareTo(max)>0)
			max=obj[i];
		}
		return max;
	}
}
public class GenericsTest
{
	public static void main(String Args[])
	{
		Scanner obj=new Scanner(System.in);
		int n,x;
		do
		{
		System.out.println("1.String\n2.Integer\n3.Double\n4.Exit");
		x=obj.nextInt();	
		
		switch(x)
		{	
			case 1 :System.out.print("Enter size : ");
				n=obj.nextInt();
				String[] a1=new String[n]; 				
				for(int i=0;i<n;i++)
				{
					a1[i]=obj.next();
				}
				GenFunc<String> g1=new GenFunc<String>();
				System.out.println("Max: " + g1.FindMax(a1));
				break;
			case 2 :System.out.print("Enter size : ");
				n=obj.nextInt();
				Integer[] a=new Integer[n]; 				
				for(int i=0;i<n;i++)
				{
					a[i]=obj.nextInt();
				}
				
				GenFunc<Integer> g=new GenFunc<Integer>();
				System.out.println("Max: " + g.FindMax(a));
				break;
			case 3 :System.out.print("Enter size : ");
				n=obj.nextInt();
				Double[] a2=new Double[n]; 				
				for(int i=0;i<n;i++)
				{
					a2[i]=obj.nextDouble();
				}

				GenFunc<Double> g2=new GenFunc<Double>();

				System.out.println("Max : "+g2.FindMax(a2));
				break;	
			case 4 :break;
			default:System.out.println("Invalid option");	
		}
		}while(x!=4);
					
	}		
}			

/*2. Write a Java program to create a generic stack and perform the operations.*/
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
								System.out.println("Deleted : "+q);
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
				Integer q1;		
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
								System.out.println("Deleted : "+q1);
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
				Double q3;		
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
								System.out.println("Deleted : "+q3);
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

/*3. Write a Java program to perform a sorting operation on various types of elements using a generic
method.
*/

import java.util.Scanner;
class Sorting<T>
{
	public <T extends Comparable<T>> void sort(T[] arr)
	{
		int i,j,pos;
		T small,temp;
		for(i=0;i<arr.length;i++)
		{
			small=arr[i];
			pos=i;
			for(j=i+1;j<arr.length;j++)
			{
				if(small.compareTo(arr[j])>0)
				{
					small=arr[j];
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	} 
}
public class GenSort
{
	public static void main(String Args[])
	{
		Scanner obj=new Scanner(System.in);
		int n,x,i;
		do
		{
		System.out.println("1.String\n2.Integer\n3.Double\n4.Exit");
		x=obj.nextInt();	
		
		switch(x)
		{	
			case 1 :System.out.print("Enter size : ");
				n=obj.nextInt();
				String[] a1=new String[n]; 				
				for(i=0;i<n;i++)
				{
					a1[i]=obj.next();
				}
				Sorting<String> g1=new Sorting<String>();
				g1.sort(a1);
				for(i=0;i<n;i++)
				{
					System.out.print(a1[i]+" ");
				}
				System.out.println();
				break;
			case 2 :System.out.print("Enter size : ");
				n=obj.nextInt();
				Integer[] a=new Integer[n]; 				
				for(i=0;i<n;i++)
				{
					a[i]=obj.nextInt();
				}
				
				Sorting<Integer> g=new Sorting<Integer>();
				g.sort(a);
				for(i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.println();
				break;
			case 3 :System.out.print("Enter size : ");
				n=obj.nextInt();
				Double[] a2=new Double[n]; 				
				for(i=0;i<n;i++)
				{
					a2[i]=obj.nextDouble();
				}

				Sorting<Double> g2=new Sorting<Double>();
				g2.sort(a2);
				for(i=0;i<n;i++)
				{
					System.out.print(a2[i]+" ");
				}
				System.out.println();
				break;	
			case 4 :break;
			default:System.out.println("Invalid option");	
		}
		}while(x!=4);
					
	}		
}			
