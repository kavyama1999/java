public class CompanyStarter
{
	
public static void main(String args[])
{
Employee emp = new Employee(1236,52000);
Manager manager=new Manager(25,true);

Company obj = new Company("Tcs","smith",emp,manager);
obj.salary();
obj.manager.leadTeam();


System.out.println("*****IT******");

Software sw = new Software(true,2);
Data data=new Data(4,true);

IT it = new IT(60,2.5588d,sw,data);
IT it1= new IT(80,3.256d,sw,data);

it1.releaseProduct();
it.developSoftware();
it.data.process();


System.out.println("*****BPO******");

Accounting acount=new Accounting(6,true);
Quality qut = new Quality("JDK",true,true);
System.out.println(acount.noOfAccounting);// referance and int variable

BPO  bpo = new BPO(true,1996,acount,qut);
BPO  bpo1 = new BPO(false,1998,acount,qut);
//Ssytem.out.println(bpo.)

bpo.provideCustomerSupport();
bpo1.handleOutSourcingProjects();

bpo.acount.manageBudget();



}
}



