public class Company1
{
public static void main(String args[])
{

String value="";
if(value!=null)//null check
{


System.out.println(value.isEmpty());//it returns true
}
String value1="Smith";
System.out.println(value1.isEmpty());// it returns false


//trim()

String val="       Hi  ";
System.out.println(val);
System.out.println(val.trim());// it removes the space


//valueOf()
int num=40;
String str = String.valueOf(num);//it  converts differnt types of values into string
System.out.println(str);

char ch='Y';
String chr = String.valueOf(ch);
System.out.println(chr);


//subString()  index start from 0
String str1 = "Good Morning";
System.out.println(str1.substring(6));
System.out.println(str1.substring(0,3));
System.out.println(str1.substring(2,3));
System.out.println(str1.substring(6,9));

System.out.println(str1.substring(0));


//String str1 = "geekyshows";
//System.out.println(str1.substring(4));
//System.out.println(str1.substring(3,10));

//replaceFirst()

String val1="Hi sihi ";    //it replace the first matching substring in a string with the specified replacement string
System.out.println(val1.replaceFirst("Hi","Hello"));

//equalsIgnoreCase()
                        //compares this string to another string,ignoring case consideration it is a boolean type
String str2="SHIVAMOGGA";

//String str3="Joga";

boolean equalsIgnoreCase=str2.equalsIgnoreCase("shivamogga");//compare 1st and 2nd string ,ignoring lower and upper case differnces
boolean equalsIgnoreCase1=str2.equalsIgnoreCase("Joga");

System.out.println(equalsIgnoreCase);

System.out.println(equalsIgnoreCase1);

//endsWith() and startsWith()//boolean type


String str4="Smithan";
boolean endsWith=str4.endsWith("n");
System.out.println(endsWith);
boolean endsWith1=str4.endsWith("k");
System.out.println(endsWith1);

boolean startsWith=str4.startsWith("n");
System.out.println(startsWith);

boolean startsWith1=str4.startsWith("S");
System.out.println(startsWith1);


//toLowerCase() and toUpperCase()//string

String str6="fish";
System.out.println(str6.toUpperCase());


String str7="fish";
System.out.println(str6.toLowerCase());

//String s1= new String("jhjhjh");
//System.out.println(s1.toUpperCase());


















}
}