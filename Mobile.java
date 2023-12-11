public class Mobile{
public static void main(String args[])
{
	play(40,23);//arguments//invoking
	play(10,20);
	push(true);
	run(5.2f,4.2f);
	//joy('K');
	cry(2.99792458d,1.672621898d);
	call(978562355417l);
	
}
static void play(int value1,int value2)//parameters
{
	int add=value1+value2;
	System.out.println(" addition of 2 values " + add);


}

static void run(float num1,float num2)
{
float min=num1-num2;
	System.out.println("min values is " + min);
	joy('K');
}
static void joy(char val)
{
	System.out.println("char " + val);
	
}
static void push(boolean val)
{
	System.out.println(" it is " + val);
}
static void cry(double val1,double val2)
{
	double multifly=val1*val2;
	System.out.println("multifle of 2 value is " + multifly );
	
}
static void ball(short val)
{
	System.out.println("value is " +val);
}
static long call(long val)
{
	
long n=val;
System.out.println("value is " + n);
return n;
}
}

