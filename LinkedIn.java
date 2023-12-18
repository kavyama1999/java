public class LinkedIn{

LinkedIn()
{
System.out.println("No parameters");
}


LinkedIn(byte num)
{
	
	System.out.println("1st constructor ="  + num );
}

LinkedIn(byte num1,char num2)
{
	
	System.out.println("2nd constructor =" + num1);
	System.out.println("2nd constructor=" + num2);
}

LinkedIn(char num2,byte num1)
{
	
	System.out.println("3rd constructor =" + num2);
	System.out.println("3rd constructor=" + num1);
}


public static void main(String args[]){
 
 
 new LinkedIn();
 byte val=28;
 new LinkedIn(val);
 new LinkedIn(val,'K');
 byte val1=56;
 new LinkedIn('Y',val1);
 
}
}