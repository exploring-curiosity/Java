import java.util.*;
public class printsquarpattern
{
	public static void main(String args[])
	{
		int i,j,x;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the side value:");
		x=obj.nextInt();
		for(i=1;i<=x;i++)
		{
			if(i==1||i==x)
			{
				for(j=1;j<=x;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(j=1;j<=x;j++)
				{
					if(j==1||j==x)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}			
			}
			System.out.println("");
		}
	}
}
/*
cs1173@u13:~/Desktop$ javac printsquarpattern.java
cs1173@u13:~/Desktop$ java printsquarpattern
Enter the side value:6
* * * * * * 
*         * 
*         * 
*         * 
*         * 
* * * * * * 
*/
