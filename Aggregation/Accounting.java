public class Accounting 
{
//states

int noOfAccounting;
boolean isAudited;

//Behaviours


void prepareFinacialStatements()
{
System.out.println("prepareFinacialStatements");
}

void manageBudget()
{
System.out.println("manageBudget");
}

void provideFinancialAdvice()
{
System.out.println("provideFinancialAdvice");
}

void conductAudits()
{
System.out.println("conductAudits");
}

Accounting(int noOfAccounting,boolean isAudited)
{
	this.noOfAccounting=noOfAccounting;
	this.isAudited=isAudited;
}

}