import java.util.*;
import java.io.*;
class OBJ implements Serializable
{
	int a;
	char b;
	OBJ(int x,char y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println(a+""+b);
	}
}
public class filetest2
{
	public static void main(String Args[])
	{
		try 
		{
			FileInputStream fis = new FileInputStream("t.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<OBJ> list = (List<OBJ>) ois.readObject();
			list.get(0).display();
			list.get(1).display();
			list.get(2).display();

			list.get(3).display();
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception caugtht"+e);
		}
	}
}