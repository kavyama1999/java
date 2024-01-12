public class Employee 
{
//states

int empId;
int salary;


//Behaviours


void work()
{
System.out.println("Working");
}

void  retire()
{
System.out.println("He is retired");
}

 Employee(int empId,int salary)
 {
	this.empId=empId;
	this.salary=salary;
}
}