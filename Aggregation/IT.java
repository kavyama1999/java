public class IT extends Company
{
//states

int NoOfEmployee;
double revenue;

Software sw;
Data data;


//Behaviours


void developSoftware()
{
System.out.println("developSoftware");
}

void releaseProduct()
{
System.out.println("releaseProduct");
}

IT()
{
	
}
    IT(int NoOfEmployee,double revenue,Software sw,Data data)
{
	this.NoOfEmployee=NoOfEmployee;
	this.revenue=revenue;
	this.sw=sw;
    this.data=data;
}

}

