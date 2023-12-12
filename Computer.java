public class Computer{
public static void main(String args[])
{
play(10.5f);
byte val=20;
play(val);
play(10);


run(10,20,30,40);
run(10,10);
run(6);

short val1=25;
game(2.3f,val1,'Y');
game('M',2.1f,val);
game(val1,'K',2.2f);





}

//1 way to declaration
static void play(int val)
{
System.out.println(" 1st Method : " + val);
}
static void play(float val)
{
	System.out.println(" 2nd Method :" + val);
}
static void play(byte val)
{
	System.out.println("3rd Method : " +  val);
}


//2 way to declaration
static void run(int val1,int val)
{
	int add=val1+val;
	System.out.println("4th method : " +add);
}
static void run(int num1,int num2,int num3,int num)
{
	System.out.println("5th Method");
}
static void run(int num)
{
	System.out.println("6th Method");
}

//3rd way to declaration
static void game(float num1,short num2,char num3)
{
	System.out.println("7th Method");
}
static void game(short num,char num3,float num2)
{
	System.out.println("8th Method");
}
static void game(char num3,float num1, short num2)
{
	System.out.println("9th Method");
}
}