import java.util.*;
public class printcheckerpattern
{
	public static void main(String args[])
	{
		int i,j,x;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the side value:");
		x=obj.nextInt();
		for(i=1;i<=x;i++)
		{
			if(i%2==0)
			{
				System.out.print(" ");
			}
			for(j=1;j<=x;j++)
			{       
				
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
/*
cs1173@u13:~/Desktop$ javac printcheckerpattern.java
cs1173@u13:~/Desktop$ java printcheckerpattern
Enter the side value:5
* * * * * 
 * * * * * 
* * * * * 
 * * * * * 
* * * * * 
*/
