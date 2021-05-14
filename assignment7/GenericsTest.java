import java.util.*;
class GenFunc<T>
{
		
	public <T extends Comparable<T>> T FindMax(T[] obj)
	{
		T max=obj[0];	
		for(int i=1;i<obj.length;i++)
		{
			if(obj[i].compareTo(max)>0)
			max=obj[i];
		}
		return max;
	}
}
public class GenericsTest
{
	public static void main(String Args[])
	{
		Scanner obj=new Scanner(System.in);
		int n,x;
		do
		{
		System.out.println("1.String\n2.Integer\n3.Double\n4.Exit");
		x=obj.nextInt();	
		
		switch(x)
		{	
			case 1 :System.out.print("Enter size : ");
				n=obj.nextInt();
				String[] a1=new String[n]; 				
				for(int i=0;i<n;i++)
				{
					a1[i]=obj.next();
				}
				GenFunc<String> g1=new GenFunc<String>();
				System.out.println("Max: " + g1.FindMax(a1));
				break;
			case 2 :System.out.print("Enter size : ");
				n=obj.nextInt();
				Integer[] a=new Integer[n]; 				
				for(int i=0;i<n;i++)
				{
					a[i]=obj.nextInt();
				}
				
				GenFunc<Integer> g=new GenFunc<Integer>();
				System.out.println("Max: " + g.FindMax(a));
				break;
			case 3 :System.out.print("Enter size : ");
				n=obj.nextInt();
				Double[] a2=new Double[n]; 				
				for(int i=0;i<n;i++)
				{
					a2[i]=obj.nextDouble();
				}

				GenFunc<Double> g2=new GenFunc<Double>();

				System.out.println("Max : "+g2.FindMax(a2));
				break;	
			case 4 :break;
			default:System.out.println("Invalid option");	
		}
		}while(x!=4);
					
	}		
}			
