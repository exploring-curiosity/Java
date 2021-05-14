import java.util.Scanner;
public class Billing
{	
	private long num;
	private String name;
	private int pmr,cmr;
	private char type;
	Billing()
	{
	}
 	void input()
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Customer Name: ");
		name=obj.next();
		System.out.print("Customer Number: ");
		num=obj.nextLong();
		System.out.print("Previous Month reading: ");
		pmr=obj.nextInt();
		System.out.print("Current Month Reading: ");
		cmr=obj.nextInt();
		System.out.print("Connection type (D/C) : ");
		type=obj.next(".").charAt(0);
	}
	double calc()
	{
		int u=cmr-pmr;
		double cost=0;
		if(type=='D')
		{
			if(u<100)
			{
				cost+=u*1.0;
				u=0;
			}
			else
			{
				cost+=100;
				u-=100;
			}
			if(u<100)
			{
				cost+=u*2.5;
				u=0;
			}
			else
			{
				cost+=250;
				u-=100;
			}
			if(u<300)
			{
				cost+=u*4;
				u=0;
			}
			else
			{
				cost+=1200;
				u-=300;
			}
			cost+=u*6;
		}
		
		if(type=='C')
		{
			if(u<100)
			{
				cost+=u*2.0;
				u=0;
			}
			else
			{
				cost+=200;
				u-=100;
			}
			if(u<100)
			{
				cost+=u*4.5;
				u=0;
			}
			else
			{
				cost+=450;
				u-=100;
			}
			if(u<300)
			{
				cost+=u*6;
				u=0;
			}
			else
			{
				cost+=1800;
				u-=300;
			}
			cost+=u*7;
		}
		return cost;
	}			
 
	public static void main(String args[])
	{
		Billing b=new Billing();
		char ch;
 		Scanner in = new Scanner(System.in);
		do
		{
			b.input();
			System.out.println("         WELCOME");
			System.out.println("your bill is.......Rs."+b.calc());
			System.out.print("do you want to continue:");
			ch=in.next(".").charAt(0);
		}while(ch=='y');
	}
}
			
/*
PS F:\java> javac Billing.java
PS F:\java> java Billing
Customer Name: santo
Customer Number: 23
Previous Month reading: 560
Current Month Reading: 890
Connection type (D/C) : D
         WELCOME
your bill is.......Rs.870.0
do you want to continue:y
Customer Name: kumar
Customer Number: 56
Previous Month reading: 760
Current Month Reading: 1230
Connection type (D/C) : C
         WELCOME
your bill is.......Rs.2270.0
do you want to continue:n
*/		 	 
			
