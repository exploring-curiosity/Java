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
		System.out.println(a+b);
	}
}
public class filetest
{
	public static void main(String Args[])
	{
		List<OBJ> list = new ArrayList<OBJ>();
		list.add(new OBJ(4,'a'));
		list.add(new OBJ(5,'q'));
		list.add(new OBJ(6,'w'));

		list.add(new OBJ(1,'z'));
		try
		{   //File f=new File("F:\\java\\project\\Filehandling\\\t.tmp");
			FileOutputStream fos = new FileOutputStream("t.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			//if(f.delete())
			//System.out.println("deleted");
		}
		catch(Exception e)
		{}
	}
}