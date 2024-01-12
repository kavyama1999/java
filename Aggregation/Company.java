public class Company
{
//states

String name;
String ceo;
Employee emp;
Manager manager;


//Behaviours


void salary()
{
System.out.println("Salary");
}

void hireEmployee()
{
System.out.println("hireEmployee");
}

Company()
{
	//super();
}


Company(String name,String ceo,Employee emp,Manager manager)
{
	this.name=name;
	this.ceo=ceo;
	this.emp=emp;
	this.manager=manager;
	//this.age=age;
	//this.isLeadingTeam=isLeadingTeam;
}

void display()
{
	System.out.println("Name :" + name);
	System.out.println("ceo :" + ceo);
	System.out.println( emp);
	System.out.println(manager);
	//System.out.println("age :" + age);
	//System.out.println("isLeadingTeam :" + isLeadingTeam);
}
}

// int empId;
// int salary;
// int age;
// boolean isLeadingTeam;
//System.out.println("Brand Name: " +brand);
//int empId,int salary,int age,boolean isLeadingTeam

//Employee emp,Manager manager