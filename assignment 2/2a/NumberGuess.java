import java.util.*;
public class NumberGuess
{
	public static void main(String args[])
	{
		int r,x,i=0;
		r=(int)(100*Math.random());
		Scanner obj = new Scanner(System.in);
		do
		{
			i++;
			System.out.print("Enter the value:");
			x=obj.nextInt();
			if(x>r)
			System.out.println("AIM LOWER");
			else if(x<r)
			System.out.println("AIM HIGHER");
			else
			System.out.println("YOU GOT IT!!!");
		}while(x!=r);
		System.out.println("You got it in "+i+" tries.");
	}
}
/*
cs1173@u13:~/Desktop$ javac NumberGuess.java
cs1173@u13:~/Desktop$ java NumberGuess
Enter the value:45
AIM HIGHER
Enter the value:67
AIM LOWER
Enter the value:65
AIM LOWER
Enter the value:56
AIM LOWER
Enter the value:53
AIM LOWER
Enter the value:50
AIM HIGHER
Enter the value:52
YOU GOT IT!!!
You got it in 7 tries.
*/
