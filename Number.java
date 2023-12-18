public class Number{

Number()//without parameters
{
	
System.out.println("1st constructor");
}


Number(int value)//with parameters
{
	System.out.println("2nd constructor" );
	System.out.println(value);
	
}


Number(int val,byte num){
	System.out.println("3rd constructor");
	
}
Number(byte num,int val){
	System.out.println("4th constructor " + num);
	System.out.println("4th constructor " +val  );
}

public static void main(String args[])
{
	new Number();
	new Number(25684);
	byte num=120;
	new Number(2451,num);
	new Number(num,100);
	
}
}




