public class Data 
{
//states


int dataSize;
boolean isEncrypted;

//String dataType;
//boolean isCompressed;


//Behaviours


void encrypt()
{
System.out.println("encrypt");
}

void process()
{
System.out.println(" is processd");
}

Data(int dataSize,boolean isEncrypted)
{
	this.dataSize=dataSize;
	this.isEncrypted=isEncrypted;
}

}