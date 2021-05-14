import java.util.*;
import java.text.*;
public class test
{
	public static void main(String args[])
	{
		Date d1,d2;
		long millis=System.currentTimeMillis();
		d1=new Date(millis);
		d2=new Date(millis);
		String s1=new String();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		String strDate = dateFormat.format(d1);
		s1=dateFormat.format(d2);
		int x=Integer.parseInt(s1.charAt(5));
		int y=Integer.parseInt(s1.charAt(6));
		int month1=x*10+y;
		int a=Integer.parseInt(s1.charAt(8));
		int b=Integer.parseInt(s1.charAt(9));
		int date1=a*10+b;
		
		System.out.println(" "+strDate);
		 x=Integer.parseInt(strDate.charAt(5));
		 y=Integer.parseInt(strDate.charAt(6));
		int month2=x*10+y;
		a=Integer.parseInt(strDate.charAt(8));
		b=Integer.parseInt(strDate.charAt(9));
		int date2=a*10+b;
		int n=0;
		if(date1>date2)
		{
			n+=date2;
			n+=30-date1;
			n+=(month2-month1-1)*30;
			System.out.println(" "+n);
		}
		if(n>15)
		{
			usr.setFine((n-15)*10);
			
		}
	}
}