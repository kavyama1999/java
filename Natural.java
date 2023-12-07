public class Natural{
public static void main(String args[])
	{
int returnedValue=joy();
System.out.println(returnedValue);	

byte byteValue=play();
System.out.println(byteValue);	

short sadValue=sad();
System.out.println(sadValue);	

long adharValue=adhar();
System.out.println(adharValue);	

float value=pieValue();
System.out.println(value);

double 	atmValue=atm();
System.out.println(atmValue);

boolean returnedNum=check();
System.out.println(returnedNum);

char letter =word();
System.out.println(letter);

}
	static int joy()
	{
		int value=80;
		return value;
	}
	static byte play()
	{
		byte value=125;
		return value;
	}
	static short sad()
	{
		
	short value=31500;
	return value;
}
static long adhar()
{
	long value=978562355417L;
	return value;
}
static float pieValue()
{
	float value=3.141f;
	return value;
}

static double atm()
{
	double value=6.283185307d;
	return value;
}
static boolean check(){
boolean num=true;
return num;
}
static char word()
{
	char value='K';
	return value;
}
}