public class BPO extends Company
{
//states

boolean isInternational;
int eastablishedYear;

Accounting acount;
Quality quality;

//Behaviours


void provideCustomerSupport()
{
System.out.println("provideCustomerSupport");
}

void handleOutSourcingProjects()
{
System.out.println("handleOutSourcingProjects");
}
BPO()
{
	
}

BPO(boolean isInternational,int eastablishedYear,Accounting acount,Quality quality)
{
	
	this.isInternational=isInternational;
	this.eastablishedYear=eastablishedYear;
	this.acount=acount;
	this.quality=quality;
}

}