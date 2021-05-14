1.Test Inheritance

import java.util.Scanner;
class person
{
	private int aadhaar;
	private String name,address;
	private char gender;

	person(int a,String b,String c,char d)
	{
		aadhaar=a;
		name=b;
		address=c;
		gender=d;	
	}
	public String getName()
	{
		return name;	
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String addr)
	{
		address=addr;
	}
	public char getGender()
	{
		return gender;
	}
}
class Student extends person
{
	private String program;
	private int year;
	private double totalmark;

	Student(int a,String b,String c,char d,String e,int f,double g)
	{
		super(a,b,c,d);
		program=e;
		year=f;
		totalmark=g;
	}
	public String getprogram()
	{
		return program;
	}	
	public int getyear()
	{
		return year;
	}
	public double gettotal()
	{
		return totalmark;
	}
	public void setyear(int a)
	{
		year =a;
	}
	public void settotal(double d)
	{
		totalmark=d;
	}
	public double calGPA()
	{
		return totalmark/10;
	}
}
class faculty extends person
{
	private String desig,dept;
	private double bp;
	
	faculty(int a,String b,String c,char d,String e,String f,double g)
	{
		super(a,b,c,d);
		desig=e;
		dept=f;
		bp=g;
	}
	public String getdesig()
	{
		return desig;
	}
	public void setdesig(String d)
	{
		desig=d;
	}
	public void setbasic(double d)
	{
		bp=d;
	}
	public double getbasic()
	{
		return bp;
	}
	public double calsalary()
	{
		double gross,deduc,net;
		gross=bp*1.7;
		deduc=bp*0.165;
		net=gross-deduc;
		return net;
	}
}
public class TestInheritance
{
	public static void main(String Args[])
	{
		int a;
		String b;
		String c;	
		char d;
		String e,t;
		int f;
		double g;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.print("aadhaar no : ");
		a=obj.nextInt();
		
		System.out.print("Name :  ");
		b=obj.next();

		System.out.print("Address : ");
		c=obj.next();

		System.out.print("Gender : ");
		d=obj.next().charAt(0);

		System.out.print("Program : ");
		e=obj.next();

		System.out.print("Year : ");
		f=obj.nextInt();

		System.out.print("Total : ");
		g=obj.nextDouble();	
		
		Student s=new Student(a,b,c,d,e,f,g);
		

		System.out.println("Enter faculty details");
		System.out.print("aadhaar no : ");
		a=obj.nextInt();
		
		System.out.print("Name :  ");
		b=obj.next();

		System.out.print("Address : ");
		c=obj.next();

		System.out.print("Gender : ");
		d=obj.next().charAt(0);

		System.out.print("Designation : ");
		e=obj.next();

		System.out.print("Department : ");
		t=obj.next();

		System.out.print("Basic Pay : ");
		g=obj.nextDouble();	
		
		faculty F=new faculty(a,b,c,d,e,t,g);

		System.out.println("    TRYING ALL FUNCTIONS");
		System.out.println("1.ALL SET FUNCTION OF STUDENT");
		System.out.println("enter total : ");
		g=obj.nextDouble();
		s.settotal(g);
		System.out.println("enter year : ");
		f=obj.nextInt();
		s.setyear(f);
		
		System.out.println("2.ALL GET FUNCTIONS OF STUDENT");
		System.out.println("name : "+s.getName());
		System.out.println("address : "+s.getAddress());
		System.out.println("gender : "+s.getGender());
		System.out.println("Program : "+s.getprogram());
		System.out.println("year : "+s.getyear());
		System.out.println("total : "+s.gettotal());
		System.out.println("3.gpa calculation ");
		System.out.println("CGPA : "+s.calGPA());



		System.out.println("1.ALL SET FUNCTION OF FACULTY");
		System.out.println("enter basic : ");
		g=obj.nextDouble();
		F.setbasic(g);
		System.out.println("enter designation : ");
		b=obj.next();
		F.setdesig(b);
		
		System.out.println("2.ALL GET FUNCTIONS OF FACULTY");
		System.out.println("name : "+F.getName());
		System.out.println("address : "+F.getAddress());
		System.out.println("gender : "+F.getGender());
		System.out.println("Designation : "+F.getdesig());
		System.out.println("Basic Pay : "+F.getbasic());
		System.out.println("3.salary calculation ");
		System.out.println("Net salary : "+F.calsalary());
	}
}

/*

cs1174@u11:~/Desktop/assignment3$ javac TestInheritance.java
cs1174@u11:~/Desktop/assignment3$ java TestInheritance
Enter student details
aadhaar no : 345
Name :  ram
Address : abcdefg
Gender : m
Program : cse
Year : 2
Total : 98
Enter faculty details
aadhaar no : 123
Name :  ravi
Address : qwerty
Gender : m
Designation : professor
Department : mechanical
Basic Pay : 40000
    TRYING ALL FUNCTIONS
1.ALL SET FUNCTION OF STUDENT
enter total : 
95
enter year : 
3
2.ALL GET FUNCTIONS OF STUDENT
name : ram
address : abcdefg
gender : m
Program : cse
year : 3
total : 95.0
3.gpa calculation 
CGPA : 9.5
1.ALL SET FUNCTION OF FACULTY
enter basic : 
80000
enter designation : 
HOD
2.ALL GET FUNCTIONS OF FACULTY
name : ravi
address : qwerty
gender : m
Designation : HOD
Basic Pay : 80000.0
3.salary calculation 
Net salary : 122800.0

*/

2.Test Shape

import java.util.*;

class Shape
{
	protected String colour="RED";
	
	Shape()
	{
		colour="BLUE";
	}
	Shape(String c)
	{
		colour=c;
	}
	
	String getColour()
	{
		return colour;
	}
	
	void setColour(String c)
	{
		colour=c;
	}
	
	
		
	
}


class Circle extends Shape
{
	protected double radius=1.0;
	
	Circle()
	{
		radius =1.0;
	}
	Circle(double r)
	{
		radius=r;
	}
	Circle(double r,String c)
	{
		super(c);
		radius=r;
	}
	double getRadius()
	{
		return radius;
	}
	void setRadius(double r)
	{
		radius=r;
	}	
	double getArea()
	{
		return (3.14*radius*radius);
	}
	double getPerimeter()
	{
		return (6.28*radius);
	}
}

class Rectangle extends Shape
{
	protected double width=1.0,length=1.0;

	Rectangle()
	{
		length =1.0;width=2.0;
	}
	Rectangle(double l,double w)
	{
		length=l;
		width=w;		
	}
	Rectangle(double l,double w,String c)
	{
		super(c);
		length=l;
		width=w;		
		
	}
	double getWidth()
	{
		return width;
	}
	double getLength()
	{
		return length;
	}
	void setWidth(double r)
	{
		width=r;
	}
	void setLength(double r)
	{
		length=r;
	}	
	double getArea()
	{
		return (length*width);
	}
	double getPerimeter()
	{
		return (2*(length+width));
	}


}


class Square extends Rectangle
{
	Square()
	{
		super(1.0,1.0);
	}
	Square(double s)
	{
		super(s,s);
	}
	Square(double s,String c)
	{
		super(s,s,c);
	}
	double getSide()
	{
		return getLength();
	}
	void setSide(double s)
	{
		setLength(s);
		setWidth(s);
	}
}


public class TestShape
{
	public static void main(String args[])
	{
		Circle C;
		Rectangle R;
		Square S;
		Scanner s=new Scanner(System.in);
		int ch,ch1;
		double x,y;
		String c;		
		do
		{
			System.out.print("\nMenu:\n1.Circle\n2.Rectangle\n3.Square\n4.Exit\n\nChoice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("\nCircle: 1.Default  2.Change radius  3. Change Radius and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						C=new Circle();
					}
					else if(ch1==2)
					{
						System.out.print("Radius: ");x=s.nextDouble();
						C=new Circle(x);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Radius: ");x=s.nextDouble();
						C=new Circle(x,c);
					
					}
					System.out.println("Area of the circle is: "+C.getArea()+"\nPerimeter of the circle is: "+C.getPerimeter());
					break;
		 
				case 2:
					System.out.print("\nRectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						R=new Rectangle();
					}
					else if(ch1==2)
					{
						System.out.print("Length: ");x=s.nextDouble();
						System.out.print("Width: ");y=s.nextDouble();
						R=new Rectangle(x,y);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Length: ");x=s.nextDouble();
						System.out.print("Width: ");y=s.nextDouble();
						R=new Rectangle(x,y,c);
					
					}
					System.out.println("Area of the Rectangle is: "+R.getArea()+"\nPerimeter of the Rectangle is: "+R.getPerimeter());
					break;
				case 3:
					System.out.print("\nCircle: 1.Default  2.Change side  3. Change side and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						S=new Square();
					}
					else if(ch1==2)
					{
						System.out.print("Side: ");x=s.nextDouble();
						S=new Square(x);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Side: ");x=s.nextDouble();
						S=new Square(x,c);
					
					}
					System.out.println("Area of the Square is: "+S.getArea()+"\nPerimeter of the Square is: "+S.getPerimeter());
					break;
			}		
		}while(ch!=4);
	}
		
}
/*
PS G:\Downloadssss> java TestShape

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 1

Circle: 1.Default  2.Change radius  3. Change Radius and Colour
Choice: 1
Area of the circle is: 3.14
Perimeter of the circle is: 6.28

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 1

Circle: 1.Default  2.Change radius  3. Change Radius and Colour
Choice: 2
Radius: 3
Area of the circle is: 28.259999999999998
Perimeter of the circle is: 18.84

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 1

Circle: 1.Default  2.Change radius  3. Change Radius and Colour
Choice: 3
Colour: red
Radius: 2
Area of the circle is: 12.56
Perimeter of the circle is: 12.56

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 2

Rectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour
Choice: 1
Area of the Rectangle is: 2.0
Perimeter of the Rectangle is: 6.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 2

Rectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour
Choice: 2
Length: 4
Width: 2
Area of the Rectangle is: 8.0
Perimeter of the Rectangle is: 12.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 2

Rectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour
Choice: 3
Colour: blue
Length: 3
Width: 4
Area of the Rectangle is: 12.0
Perimeter of the Rectangle is: 14.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 3

Circle: 1.Default  2.Change side  3. Change side and Colour
Choice: 1
Area of the Square is: 1.0
Perimeter of the Square is: 4.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 3

Circle: 1.Default  2.Change side  3. Change side and Colour
Choice: 2
Side: 2
Area of the Square is: 4.0
Perimeter of the Square is: 8.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 3

Circle: 1.Default  2.Change side  3. Change side and Colour
Choice: 3
Colour: black
Side: 4
Area of the Square is: 16.0
Perimeter of the Square is: 16.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 4
*/

 