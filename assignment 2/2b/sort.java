import java.util.Scanner;
public class sort
{
	Scanner obj = new Scanner(System.in);
	int i,j,temp,n,a[];
	public void initialize()
	{
		System.out.println("Enter no. elements:");
		n=obj.nextInt();
		a=new int[n];
	}
	public void input()
	{
		System.out.println("\nEnter elements:");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
	}
	public void sorting(int x)
	{
		if(x==1)
		{
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		else if(x==2)
		{
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		else
		{
			System.out.println("Enter the option correctly");	
		}	
	}	
	public void print()
	{
		System.out.println("\nThe Sorted array is");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String args[])
	{
		int i;
		Scanner ob= new Scanner(System.in);
		sort a = new sort();
		a.initialize();
		a.input();
		char rep;
		do
		{
			System.out.print("\nSorting type\n1.Ascending\n2.Descending");
			System.out.println("\nEnter the option");
			int x=ob.nextInt();
			a.sorting(x);
			a.print();
			System.out.println("Do you want to continue");
			rep=ob.next().charAt(0);
		}	
		while(rep=='y');
	}
}	

/*

PS F:\java> javac sort.java
PS F:\java> java sort
Enter no. elements:
6

Enter elements:
3
4
2
6
1
8

Sorting type
1.Ascending
2.Descending
Enter the option
1

The Sorted array is
1
2
3
4
6
8
Do you want to continue
y

Sorting type
1.Ascending
2.Descending
Enter the option
2

The Sorted array is
8
6
4
3
2
1
Do you want to continue
n

*/