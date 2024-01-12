public class Software 
{
//states

boolean isReleased;
int version;

//Behaviours

void updateVersion()
{
System.out.println("updateVersion");
}

void acquireCompany()
{
System.out.println("acquireCompany");
}

void fixBug()
{
System.out.println("fixBug");
}

void conductTesting()
{
System.out.println("conductTesting");
}


Software(boolean isReleased,int version)
{
	this.isReleased=isReleased;
	this.version=version;
}

}