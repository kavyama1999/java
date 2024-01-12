public class Manager 
{
//states

int age;
boolean isLeadingTeam;


//Behaviours


void leadTeam()
{
System.out.println("leadTeam");
}

void  conductMeeting()
{
System.out.println("conductMeeting");
}

 Manager(int age,boolean isLeadingTeam)
{
	
	this.age=age;
	this.isLeadingTeam=isLeadingTeam;
}

}