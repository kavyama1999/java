public class Board{
public static void main(String args[])
{

//upcasting
//byte to short

byte val=100;
short num=val;
System.out.println("short num " + num);

short shortNum=25000;
int intVal=shortNum;
System.out.println(intVal);

int intNum=2115363698;
long longValue=intNum;
System.out.println(longValue);


float floatVal=28.5f;
double doubleNum=floatVal;
System.out.println(doubleNum);

char charVal='m';
int value=charVal;
System.out.println(value);

char charVal1='K';
int value1=charVal1;
System.out.println(value1);


//down casting

long longVal=9635365412l;
int intNumber=(int)longVal;
System.out.println(intNumber);

int intNumber1=211525;
short shortNumber=(short)intNumber1;
System.out.println(shortNumber);

short shNum=30000;
byte byteVal=(byte)shNum;
System.out.println(byteVal);

double doubleNumber=4.256123654d;
float floatNumber=(float)doubleNumber;
System.out.println(floatNumber);

double dNum=20.3652d;
int iNum=(int)dNum;
System.out.println(iNum);

int intValues=65;
char charValues=(char)intValues;
System.out.println(charValues);

int intValues1=258;
char charValues1=(char)intValues1;
System.out.println(charValues1);





//problems

char value3='k';
int value2=value3-32;
char uppercase=(char)value2;
System.out.println(uppercase);


char value4='M';
int value5=value4+32;
char lowercase=(char)value5;
System.out.println(lowercase);

char v='y';
int i=v-32;
char uppercase1=(char)i;
System.out.println(uppercase1);

}
}