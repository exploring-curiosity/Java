import java.util.*;
public class printtriangularpattern
{
	public static void main(String args[])
	{
		int x,i,j;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the side value:");
		x=obj.nextInt();
		for(i=1;i<=x;i++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		for(i=2;i<=x;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<=2*x-3-2*(i-1);j++)
			{
				System.out.print(" ");
			}
			if(i!=x)
			System.out.print("*");
			System.out.println("");
		}
	}
}
/*
cs1173@u13:~/Desktop$ javac printtriangularpattern.java
cs1173@u13:~/Desktop$ java printtriangularpattern
Enter the side value:4
* * * * 
 *   *
  * *
   *
*/

