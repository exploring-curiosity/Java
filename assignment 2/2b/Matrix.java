import java.util.Scanner;
public class Matrix
{
	
	static void display(int[][] m,int p,int q)
	{
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	static void multiply(int[][] m1,int[][] m2,int[][] m3,int p,int q,int r,int s)
	{
		if(q!=r)
		{
			System.out.println("Matrix multiplication not possible");
		}
		else
		{	
		int i,j,k;
		for(i=0;i<p;i++)
		{
			for(j=0;j<s;j++)
			{
				for(k=0;k<r;k++)
				{
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		display(m3,p,s);
		}
	}
	static void add(int[][] m1,int[][] m2,int[][] m3,int p,int q,int r,int s)
	{
		if(p!=r||q!=s)
		{
			System.out.println("Matrix addition not possible");
		}
		else
		{
		int i,j;
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
		display(m3,p,q);
		}
	}
	static void getmat(int[][] m,int p,int q)
	{
		Scanner obj=new Scanner(System.in);
		int j,i;
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				m[i][j]=obj.nextInt();
			}
		}
	}

	
	public static void main(String args[])
	{
		int m1[][]=new int[10][10];
		int m2[][]=new int[10][10];
		int m3[][]=new int[10][10];
		int p,q,r,s;
		char rep,ch;
		Scanner ob=new Scanner(System.in);
		do
		{
		
		System.out.print("1.multiplication\n 2.addition \n your choice : ");
		ch=ob.next().charAt(0);
		System.out.println("enter size for matrix 1(m x n)");
		p = ob.nextInt();
		q = ob.nextInt();
		System.out.println("enter size for matrix 2(m x n)");
		r = ob.nextInt();
		s = ob.nextInt();
		System.out.println("Enter matrix 1");
		getmat(m1,p,q);
		System.out.println("Enter matrix 2");
		getmat(m2,r,s);
		switch(ch)
		{
			case '1' :  multiply(m1,m2,m3,p,q,r,s);
						break;
			case '2' :  add(m1,m2,m3,p,q,r,s);
						break;
			default :System.out.println("Invalid");
		}
		System.out.print("Do you want to continue?");
		rep=ob.next().charAt(0);
		}while(rep=='y');
		
	}
	
}
/*

PS F:\java> javac Matrix.java
PS F:\java> java Matrix
1.multiplication
 2.addition
 your choice : 1
enter size for matrix 1(m x n)
2 3
enter size for matrix 2(m x n)
3 3
Enter matrix 1
2 3 4
5 6 7
Enter matrix 2
1 2 3
4 5 6
7 8 9
42 51 60
78 96 114
Do you want to continue?y
1.multiplication
 2.addition
 your choice : 2
enter size for matrix 1(m x n)
3 2
enter size for matrix 2(m x n)
3 2
Enter matrix 1
1 2
3 4
5 6
Enter matrix 2
5 6
3 4
1 2
6 8
6 8
6 8
Do you want to continue?n

*/