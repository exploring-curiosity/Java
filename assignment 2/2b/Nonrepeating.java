import java.util.Scanner;
public class Nonrepeating
{
	static int nr(int a[],int n)
	{
		int i,j,flag=0,count=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					continue;
				}
				else if(a[i]==a[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			count++;
			flag=0;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[]=new int[20];
		int n,i;
		System.out.println("Enter the no. of elements");
		n=obj.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		n=nr(a,n);
		System.out.println("No. of non repeating terms is"+n);
	}
}
/*

PS F:\java> javac Nonrepeating.java
PS F:\java> java Nonrepeating
Enter the no. of elements
7
Enter the elements
1
3
2
1
5
6
2
No. of non repeating terms is3

*/