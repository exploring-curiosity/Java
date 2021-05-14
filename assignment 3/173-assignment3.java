/*1. Write a java program with a class named ‘Box’ with three parameters length, width and depth.
Inherit a class named ‘BoxWeight’ from ‘Box’ with an additional member weight of the box. Inherit
‘BoxShipment’ from ‘BoxWeight’ with an additional member shipmentcost. Calculate the volume
and cost for the box on shipment.*/



import java.util.Scanner;
class Box
{
	double length,width,depth;
	Box(double a,double b,double c)
	{
		length=a;width=b;depth=c;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(double a,double b,double c,double d)
	{
		super(a,b,c);
		weight=d;
	}
	double volume()
	{
		return length*width*depth;
	}
}
class BoxShipment extends BoxWeight
{
	double shipmentcost;
	BoxShipment(double a,double b,double c,double d,double e)
	{
		super(a,b,c,d);
		shipmentcost=e;
	}
	double calcost()
	{
		return shipmentcost*weight;
	}
}

public class Boxinh
{
	public static void main(String args[])
	{
		Scanner obj =new Scanner(System.in);
		double a,b,c,d,e;
		System.out.print("enter the dimensions of the box : ");
		a=obj.nextDouble();
		b=obj.nextDouble();
		c=obj.nextDouble();
	
		System.out.print("enter the box weight : ");
		d=obj.nextDouble();
		System.out.print("enter cost per unit weight : ");
		e=obj.nextDouble();
		BoxShipment box=new BoxShipment(a,b,c,d,e);
		System.out.println("VOLUME:"+box.volume());
		System.out.println("Cost:"+box.calcost()); 	
	}
}
/*

cs1173@u13:~/Desktop/sudharshan/assignment3$ javac Boxinh.java
cs1173@u13:~/Desktop/sudharshan/assignment3$ java Boxinh
enter the dimensions of the box : 1   
2
3
enter the box weight : 5
enter cost per unit weight : 10
VOLUME:6.0
Cost:50.0

*/


		
	



/*
2. Develop a Java application with Employee class with Emp_name, Emp_id, Address, Mail_id,
Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor
and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes
with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund.
Generate pay slips for the employees with their gross and net salary.
*/


import java.util.Scanner;
class Employee
{
	String Emp_name,Address,Mail_id;
	int Emp_id;
	double Mobile_no;
	Employee(String a,String b,String c,int d,double e)
	{
		Emp_name=a;
		Address=b;
		Mail_id=c;
		Emp_id=d;
		Mobile_no=e;
	}
}
class Programmer extends Employee
{
	double bp,da,hra,pf,fund;
	Programmer(String a,String b,String c,int d,double e,double f)
	{
		super(a,b,c,d,e);
		bp=f;
	}
	void payslip()
	{
		da=0.97*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		fund=0.001*bp;
		System.out.println("-------PAYSLIP--------");
 		System.out.println("BASIC : "+bp+" DA : "+da+" HRA : "+hra);
		System.out.println("PF : "+pf+"Funds : "+fund);
		double gross=bp+hra+da;
		double ded=pf+fund;
		double net=gross-ded;
		System.out.println("GROSS PAY : "+gross);
		System.out.println("Deductions: "+ded);
		System.out.println("NET PAY   : "+net);
	}
}

class AsstProfessor extends Employee
{
	double bp,da,hra,pf,fund;
	AsstProfessor(String a,String b,String c,int d,double e,double f)
	{
		super(a,b,c,d,e);
		bp=f;
	}
	void payslip()
	{
		da=0.97*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		fund=0.001*bp;
		System.out.println("-------PAYSLIP--------");
 		System.out.println("BASIC : "+bp+" DA : "+da+" HRA : "+hra);
		System.out.println("PF : "+pf+"Funds : "+fund);
		double gross=bp+hra+da;
		double ded=pf+fund;
		double net=gross-ded;
		System.out.println("GROSS PAY : "+gross);
		System.out.println("Deductions: "+ded);
		System.out.println("NET PAY   : "+net);
	}
}
class AssoProfessor extends Employee
{
	double bp,da,hra,pf,fund;
	AssoProfessor(String a,String b,String c,int d,double e,double f)
	{
		super(a,b,c,d,e);
		bp=f;
	}	
	void payslip()
	{
		da=0.97*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		fund=0.001*bp;
		System.out.println("-------PAYSLIP--------");
 		System.out.println("BASIC : "+bp+" DA : "+da+" HRA : "+hra);
		System.out.println("PF : "+pf+"Funds : "+fund);
		double gross=bp+hra+da;
		double ded=pf+fund;
		double net=gross-ded;
		System.out.println("GROSS PAY : "+gross);
		System.out.println("Deductions: "+ded);
		System.out.println("NET PAY   : "+net);
	}
}
class Professor extends Employee
{
	double bp,da,hra,pf,fund;
	Professor(String a,String b,String c,int d,double e,double f)
	{
		super(a,b,c,d,e);
		bp=f;
	}	
	void payslip()
	{
		da=0.97*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		fund=0.001*bp;
		System.out.println("-------PAYSLIP--------");
 		System.out.println("BASIC : "+bp+" DA : "+da+" HRA : "+hra);
		System.out.println("PF : "+pf+"Funds : "+fund);
		double gross=bp+hra+da;
		double ded=pf+fund;
		double net=gross-ded;
		System.out.println("GROSS PAY : "+gross);
		System.out.println("Deductions: "+ded);
		System.out.println("NET PAY   : "+net);
	}
}

public class empinh
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		char rep;
		String a=new String();String b=new String();String c=new String();int d,ch;double e;double f;		

		do		
		{
			System.out.println("Choose Designation:");
			System.out.println("1.programmer");
			System.out.println("2.Assistant professor");
			System.out.println("3.Associate professor");
			System.out.println("4.Professor");
			ch=obj.nextInt();
			System.out.print("Name :");
			a=obj.next();
			System.out.print("Id :");
			d=obj.nextInt();
			System.out.print("Address :");
			b=obj.next();
			System.out.print("Mail id :");
			c=obj.next();
			System.out.print("Mobile no :");
			e=obj.nextDouble();
			System.out.print("Basic Pay :");
			f=obj.nextDouble();
			switch(ch)
			{
				case 1 :Programmer p=new Programmer(a,b,c,d,e,f);
					p.payslip();
					break;
				case 2 :AsstProfessor q=new AsstProfessor(a,b,c,d,e,f);
					q.payslip();
					break;
				case 3 :AssoProfessor r=new AssoProfessor(a,b,c,d,e,f);
					r.payslip();
					break;
				case 4 :Professor s=new Professor(a,b,c,d,e,f);
					s.payslip();
					break;
				default:System.out.println("\n INVALID");			
			}
			System.out.print("Do you want to continue (y/n)?");
			rep=obj.next().charAt(0);
		}while(rep=='y');
	}

}

/*

Choose Designation:
1.programmer
2.Assistant professor
3.Associate professor
4.Professor
1
Name :ram
Id :1
Address :asfdgvfd
Mail id :dfgsgssfgdf
Mobile no :123456789
Basic Pay :20000
-------PAYSLIP--------
BASIC : 20000.0 DA : 19400.0 HRA : 2000.0
PF : 2400.0Funds : 20.0
GROSS PAY : 41400.0
Deductions: 2420.0
NET PAY   : 38980.0
Do you want to continue (y/n)?y
Choose Designation:
1.programmer
2.Assistant professor
3.Associate professor
4.Professor
2
Name :kamal
Id :3
Address :gsgdhjfgd
Mail id :dfgfsd 
Mobile no :1234345564
Basic Pay :40000
-------PAYSLIP--------
BASIC : 40000.0 DA : 38800.0 HRA : 4000.0
PF : 4800.0Funds : 40.0
GROSS PAY : 82800.0
Deductions: 4840.0
NET PAY   : 77960.0
Do you want to continue (y/n)?y
Choose Designation:
1.programmer
2.Assistant professor
3.Associate professor
4.Professor
3
Name :tarun
Id :5
Address :dsfdsfgdg
Mail id :ffdsgdfg
Mobile no :15653236674
Basic Pay :34000
-------PAYSLIP--------
BASIC : 34000.0 DA : 32980.0 HRA : 3400.0
PF : 4080.0Funds : 34.0
GROSS PAY : 70380.0
Deductions: 4114.0
NET PAY   : 66266.0
Do you want to continue (y/n)?y
Choose Designation:
1.programmer
2.Assistant professor
3.Associate professor
4.Professor

4
Name :guru
Id :7
Address :sdfgdbh
Mail id :sgdfbg
Mobile no :1234568643
Basic Pay :45000
-------PAYSLIP--------
BASIC : 45000.0 DA : 43650.0 HRA : 4500.0
PF : 5400.0Funds : 45.0
GROSS PAY : 93150.0
Deductions: 5445.0
NET PAY   : 87705.0
Do you want to continue (y/n)?n

*/



/*
3. Write a Java program with a class named ‘Person’ which consists of name, age, DOB and
address. Have functions to get input and calculate_performance. Derive a class named ‘Student’
from ‘Person’ class with additional members like department, marks, extra-curricular. Calculate
performance of Student (Outstanding, Excellent, Good, Fair) based on the grade and extra-
curricular activities. Derive a class named ‘Professor’ from ‘Person’ with additional members like
department, number of publications and funded projects. Calculate performance of Professor based
on the number of publications and funded projects. In main get ‘n’ number of Persons' information
and calculate the performance.
*/




import java.util.*;

abstract class Person
{
	String Name, Address, DOB;
	int Age;
	
	Person()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter details: ");
		System.out.print("Name : ");
		Name=s.nextLine();
		System.out.print("Age  : ");
		Age=s.nextInt();
		s.nextLine();	
		System.out.print("Enter DOB in (dd/mm/yyyy) format : ");
		DOB=s.nextLine();
		
	}

	abstract void calc_Per();
	
}


class Student extends Person
{
	String Dept, G, EG, Per, desig;
	
	Student()
	{
		super();
		desig="Student";
		Scanner s=new Scanner(System.in);		
		System.out.print("Department : ");
		Dept=s.nextLine();
		System.out.print("Grade : ");
		G=s.nextLine();
		System.out.print("Other activity Grade: ");
		EG=s.nextLine();calc_Per();
		

	}
	void calc_Per()
	{	
		if(G.equals("O") && EG.equals("O"))
			Per="Outstanding";
		else if(G.equals("O") || EG.equals("O"))
			Per="Excellent";
		else
		{
			if(G.equals("A") && EG.equals("A"))
				Per="Excellent";
			else if(G.equals("A") || EG.equals("A"))
				Per="Good";
			else
				Per="Fair";	
		}
	
		System.out.println("Performance : "+Per);
	}


}


class Professor extends Person
{
	String Dept, Per, desig;
	int  P,FP;
	Professor()
	{
		super();
		desig="Professor";
		Scanner s=new Scanner(System.in);		
		System.out.print("Department: ");
		Dept=s.nextLine();
		System.out.print("No.of Publications: ");
		P=s.nextInt();
		System.out.print("No.of Funded Projects: ");
		FP=s.nextInt();calc_Per();
		

	}
	void calc_Per()
	{	
		Scanner s=new Scanner(System.in);
		if(P>20 && FP >20)
			Per="Outstanding";
		else if(P>20 || FP >20)
			Per="Excellent";
		else
		{
			if(P>15 && FP >15)
				Per="Excellent";
			else if(P>15 || FP >15)
				Per="Good";
			else
				Per="Fair";	
		}
		System.out.println("Performance : "+Per);
		s.nextLine();
			
	}
}


public class perInfo
{
	public static void main(String args[])
	{
		Student S[]=new Student[40];
		Professor P[]=new Professor[40];
		System.out.print("Enter the total count of people : ");		
		int n,sc=0,pc=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		String t;
		for(int i=0;i<n;i++)
		{	System.out.print("1.Student\n2.Professor \n your designation : ");
			t=s.nextLine();
			if(t.equals("Student"))
				S[sc++]=new Student();
			else if(t.equals("Professor"))
				P[pc++]=new Professor();
			else
			{
				System.out.println("INVALID");
				i--;
			}	
		}
			
	}
}


/*
cs1173@u13:~/Desktop/sudharshan/assignment3$ java perInfo
Enter the total count of people : 2
1.Student
2.Professor 
 your designation : INVALID
1.Student
2.Professor 
 your designation : Student
Enter details: 
Name : ram
Age  : 23
Enter DOB in (dd/mm/yyyy) format : 12/05/2000
Department : CSE
Grade : O
Other activity Grade: O
Performance : Outstanding
1.Student
2.Professor 
 your designation : Professor
Enter details: 
Name : kamal
Age  : 56
Enter DOB in (dd/mm/yyyy) format : 31/01/1982
Department: CSE
No.of Publications: 12
No.of Funded Projects: 8
Performance : Fair


*/

